package com.app.scorecalculator.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileDataReader implements DataReader<Set<String>> {

    private String fileName;

    public FileDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Set<String> read() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        Set<String> elementSet = new HashSet<String>();

        try {
            while (bufferedReader.ready()) {
                final String element = bufferedReader.readLine();
                if(element != null && element.trim().length() > 0)
                    elementSet.add(element);
            }
        } finally {
            if(bufferedReader != null)
                bufferedReader.close();
        }

        return elementSet;
    }

}
