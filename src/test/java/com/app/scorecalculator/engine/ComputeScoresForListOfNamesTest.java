package com.app.scorecalculator.engine;

import com.app.scorecalculator.algorithm.AlgorithmToCalculateScoreForString;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ComputeScoresForListOfNamesTest {

    @Test
    public void assert_that_score_for_list_containing_one_name_as_john_is_47() {

        Iterator<String> iterator = (Iterator<String>) mock(Iterator.class);
        when(iterator.hasNext()).thenReturn(true, false);
        when(iterator.next()).thenReturn("John");

        Set<String> setWithOneName = (Set<String>) mock(Set.class);
        when(setWithOneName.iterator()).thenReturn(iterator);

        ComputeEngine<String> computeEngine = new ComputeEngineImpl<>(new AlgorithmToCalculateScoreForString());

        computeEngine.addElementsForSorting(setWithOneName);
        Integer score = computeEngine.calculateScore();

        Assert.assertEquals(new Integer(47), score);

    }

    @Test
    public void assert_that_score_for_list_containing_one_name_as_john_is_47_score_summary_is_available() {

        Iterator<String> iterator = (Iterator<String>) mock(Iterator.class);
        when(iterator.hasNext()).thenReturn(true, false);
        when(iterator.next()).thenReturn("John");

        Set<String> setWithOneName = (Set<String>) mock(Set.class);
        when(setWithOneName.iterator()).thenReturn(iterator);

        ComputeEngine<String> computeEngine = new ComputeEngineImpl<>(new AlgorithmToCalculateScoreForString());

        computeEngine.addElementsForSorting(setWithOneName);
        Integer score = computeEngine.calculateScore();

        Assert.assertEquals(new Integer(47), score);

    }

    @Test
    public void assert_that_score_for_list_containing_two_names_john_and_ron_is_141() {

        Iterator<String> iterator = (Iterator<String>) mock(Iterator.class);
        when(iterator.hasNext()).thenReturn(true, true, false);
        when(iterator.next()).thenReturn("John", "Ron");

        Set<String> setWithTwoNames = (Set<String>) mock(Set.class);
        when(setWithTwoNames.iterator()).thenReturn(iterator);

        ComputeEngine<String> computeEngine = new ComputeEngineImpl<>(new AlgorithmToCalculateScoreForString());

        computeEngine.addElementsForSorting(setWithTwoNames);
        Integer score = computeEngine.calculateScore();

        Assert.assertEquals(new Integer(141), score);

    }

    @Test
    public void assert_that_score_for_list_containing_two_names_john_and_ron_is_141_and_score_summary_is_available() {

        Iterator<String> iterator = (Iterator<String>) mock(Iterator.class);
        when(iterator.hasNext()).thenReturn(true, true, false);
        when(iterator.next()).thenReturn("John", "Ron");

        Set<String> setWithTwoNames = (Set<String>) mock(Set.class);
        when(setWithTwoNames.iterator()).thenReturn(iterator);

        ComputeEngine<String> computeEngine = new ComputeEngineImpl<>(new AlgorithmToCalculateScoreForString());

        computeEngine.addElementsForSorting(setWithTwoNames);
        Integer score = computeEngine.calculateScore();

        Assert.assertEquals(new Integer(141), score);

    }

    @Test
    public void assert_that_score_for_empty_list_is_0() {

        Iterator<String> iterator = (Iterator<String>) mock(Iterator.class);
        when(iterator.hasNext()).thenReturn(false);

        Set<String> emptyList = (Set<String>) mock(Set.class);
        when(emptyList.iterator()).thenReturn(iterator);

        ComputeEngine<String> computeEngine = new ComputeEngineImpl<>(new AlgorithmToCalculateScoreForString());

        computeEngine.addElementsForSorting(emptyList);
        Integer score = computeEngine.calculateScore();

        Assert.assertEquals(new Integer(0), score);

    }

}