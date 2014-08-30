package com.app.scorecalculator.algorithm;

import org.junit.Assert;
import org.junit.Test;

public class CalculateScoresForStringTest {

    @Test
    public void assert_that_calculated_score_for_string_with_letter_A_Is_1() throws Exception {

        AlgorithmToCalculateScoreForString algorithm = new AlgorithmToCalculateScoreForString();
        Integer score = algorithm.compute("A");
        Assert.assertEquals(new Integer(1), score);

    }

    @Test
    public void assert_that_calculated_score_for_string_with_letter_ab_in_lower_case_is_3() throws Exception {

        AlgorithmToCalculateScoreForString algorithm = new AlgorithmToCalculateScoreForString();
        Integer score = algorithm.compute("ab");
        Assert.assertEquals(new Integer(3), score);

    }

    @Test
    public void assert_that_calculated_score_for_string_with_letter_AB_in_upper_case_Is_3() throws Exception {

        AlgorithmToCalculateScoreForString algorithm = new AlgorithmToCalculateScoreForString();
        Integer score = algorithm.compute("AB");
        Assert.assertEquals(new Integer(3), score);

    }

    @Test
    public void assert_that_sum_of_all_alphabets_from_a_to_z_is_351() throws Exception {

        AlgorithmToCalculateScoreForString algorithm = new AlgorithmToCalculateScoreForString();
        Integer score = algorithm.compute("ABcDEfGHIJKLMNOPQRSTuvwxyz");
        Assert.assertEquals(new Integer(351), score);

    }

    @Test
    public void assert_that_only_letters_is_allowed_in_string() throws Exception {

        AlgorithmToCalculateScoreForString algorithm = new AlgorithmToCalculateScoreForString();
        Integer score = algorithm.compute("A B");
        Assert.assertEquals(new Integer(3), score);

    }

    @Test
    public void assert_that_no_special_character_is_allowed_in_string_case_1() throws Exception {

        AlgorithmToCalculateScoreForString algorithm = new AlgorithmToCalculateScoreForString();
        Integer score = algorithm.compute("A#B");
        Assert.assertEquals(new Integer(3), score);

    }

    @Test
    public void assert_that_no_special_character_is_allowed_in_string_case_2() throws Exception {

        AlgorithmToCalculateScoreForString algorithm = new AlgorithmToCalculateScoreForString();
        Integer score = algorithm.compute("#A#B#    ");
        Assert.assertEquals(new Integer(3), score);

    }

    @Test
    public void assert_that_no_special_character_is_allowed_in_string_case_3() throws Exception {

        AlgorithmToCalculateScoreForString algorithm = new AlgorithmToCalculateScoreForString();
        Integer score = algorithm.compute("#$ % * @ 2 #A#B#    ");
        Assert.assertEquals(new Integer(3), score);

    }

}