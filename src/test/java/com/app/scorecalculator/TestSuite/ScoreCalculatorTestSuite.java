package com.app.scorecalculator.TestSuite;

import com.app.scorecalculator.reader.ReadNamesFromAFileTest;
import com.app.scorecalculator.algorithm.CalculateScoresForStringTest;
import com.app.scorecalculator.algorithm.ValidCharactersInStringTest;
import com.app.scorecalculator.engine.ComputeScoresForListOfNamesTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                CalculateScoresForStringTest.class,
                ValidCharactersInStringTest.class,
                ComputeScoresForListOfNamesTest.class,
                ReadNamesFromAFileTest.class
        }
)
public class ScoreCalculatorTestSuite {
}
