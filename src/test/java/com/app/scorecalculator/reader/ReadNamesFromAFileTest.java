package com.app.scorecalculator.reader;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class ReadNamesFromAFileTest {

    @Test
    public void assert_that_filename_Filewithnames_has_119_rows() throws Exception {

        DataReader<Set<String>> dataReader = new FileDataReader(getClass().getResource("/Filewithnames.txt").getFile());
        Assert.assertEquals(119, dataReader.read().size());

    }

    @Test
    public void assert_that_filename_FilewithNonames_has_0_rows() throws Exception {

        DataReader<Set<String>> dataReader = new FileDataReader(getClass().getResource("/FilewithNonames.txt").getFile());
        Assert.assertEquals(0, dataReader.read().size());

    }

    @Test(expected = Exception.class)
    public void assert_that_file_not_found_throws_exception() throws Exception {

        DataReader<Set<String>> dataReader = new FileDataReader(getClass().getResource("/FilewithUniquenames.txt").getFile());
        Assert.assertEquals(0, dataReader.read().size());

    }

}