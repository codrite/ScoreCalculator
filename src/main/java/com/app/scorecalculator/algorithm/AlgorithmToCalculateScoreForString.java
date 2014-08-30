package com.app.scorecalculator.algorithm;

import java.lang.String;

public class AlgorithmToCalculateScoreForString implements Algorithm<String> {

    @Override
    public Integer compute(String string) {
        Integer stringScore = 0;

        for(char eachChar : string.toLowerCase().toCharArray()) {
            if(isAllowedCharacter(eachChar))
                stringScore += ((eachChar - 'a') + 1);
        }

        return stringScore;
    }

    protected boolean isAllowedCharacter(char eachChar) {
        return eachChar >= 'a' && eachChar <= 'z';
    }

}
