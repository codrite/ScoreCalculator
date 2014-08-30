package com.app.scorecalculator;


import java.io.IOException;
import java.util.Set;

import com.app.scorecalculator.algorithm.AlgorithmToCalculateScoreForString;
import com.app.scorecalculator.engine.ComputeEngine;
import com.app.scorecalculator.engine.ComputeEngineImpl;
import com.app.scorecalculator.reader.FileDataReader;

public class Main {

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        if (args.length < 1) {
            System.err.print("No Arguments specified : Usage java com.app.scorecalculator.Main <file_name>");
            System.exit(-1);
        }

        String fileName;
        if (args.length == 1)
            fileName = args[0];
        else
            fileName = args[1];

        Set<String> elementSet = new FileDataReader(fileName).read();

        ComputeEngine<String> computeEngine = new ComputeEngineImpl<>(new AlgorithmToCalculateScoreForString());
        computeEngine.addElementsForSorting(elementSet);
        Integer score = computeEngine.calculateScore();

        assert score >= 0;

        System.out.println(" --- Score Summary --- : ");
        System.out.println(" --- Score --- : " + score);

        System.out.println(" Time (ms) : " + (System.currentTimeMillis() - startTime));
    }

}
