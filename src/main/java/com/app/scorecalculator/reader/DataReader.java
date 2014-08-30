package com.app.scorecalculator.reader;

public interface DataReader<T> {

    T read() throws Exception;

}
