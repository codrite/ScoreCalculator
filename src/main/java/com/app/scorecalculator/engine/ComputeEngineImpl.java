package com.app.scorecalculator.engine;

import com.app.scorecalculator.algorithm.Algorithm;
import com.app.scorecalculator.task.TaskToCalculateScore;

import java.util.Queue;
import java.util.concurrent.*;

public class ComputeEngineImpl<S extends Comparable<S>, A extends Algorithm<S>> extends ComputeEngine<S> {

    private A algorithm;
    private ExecutorService executorService;
    private Queue<Future<Integer>> queue;

    public ComputeEngineImpl(A algorithm) {
        super();
        this.algorithm = algorithm;
        executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        queue = new ConcurrentLinkedQueue<>();
    }

    @Override
    public Integer calculateScore() {
        Integer rank = 1;
        for(S stringValue : elementSet) {
            Callable<Integer> callable =
                    new TaskToCalculateScore<>(rank++, stringValue, algorithm);
            queue.add(executorService.submit(callable));
        }
        return addFutureTasksResults();
    }

    private Integer addFutureTasksResults() {
        Integer result = 0;

        try {
            while (queue.size() > 0) {
                Future<Integer> future = queue.remove();

                if (future.isDone())
                    result += future.get();
                else
                    queue.add(future);
            }
        } catch (InterruptedException | ExecutionException exception) {
            System.err.println(" -- Interrupted Execution during execution -- ");
        }

        executorService.shutdownNow();

        return result;
    }

}
