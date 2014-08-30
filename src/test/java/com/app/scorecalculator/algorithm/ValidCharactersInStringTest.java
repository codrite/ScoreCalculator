package com.app.scorecalculator.algorithm;

import org.junit.Assert;
import org.junit.Test;

public class ValidCharactersInStringTest {

    @Test
    public void assert_that_a_is_valid_character() {
        AlgorithmToCalculateScoreForString algorithmToCalculateScoreForString =
                new AlgorithmToCalculateScoreForString();

        boolean result = algorithmToCalculateScoreForString.isAllowedCharacter('a');

        Assert.assertEquals(true, result);
    }

    @Test
    public void assert_that_tilde_is_invalid_character() {
        AlgorithmToCalculateScoreForString algorithmToCalculateScoreForString =
                new AlgorithmToCalculateScoreForString();

        boolean result = algorithmToCalculateScoreForString.isAllowedCharacter('~');

        Assert.assertEquals(false, result);
    }


}
