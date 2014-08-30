package com.app.scorecalculator.task;

import com.app.scorecalculator.algorithm.Algorithm;

import java.util.concurrent.Callable;

public class TaskToCalculateScore<T, A extends Algorithm<T>> implements Callable<Integer> {

    private Integer rank;
    private T value;
    private A algorithm;

    public TaskToCalculateScore(Integer rank, T value, A algorithm) {
        this.rank = rank;
        this.value = value;
        this.algorithm = algorithm;
    }

    @Override
    public Integer call() throws Exception {
        return rank * algorithm.compute(value);
    }
}
