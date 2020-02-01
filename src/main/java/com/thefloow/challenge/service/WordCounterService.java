package com.thefloow.challenge.service;

import java.nio.file.Path;
import java.util.Map;

import com.thefloow.challenge.exception.FileReadingException;

/**
 * Given a file/ part of a file
 * find unique word and it's number of occurrence.
 * Return the results in a Hash Map (Key = word, Value= count)
 */
public interface WordCounterService {

    /**
     * given a file, find unique word and it's number of occurrence
     *
     * @param filePath   Path of file to be split.
     * @throws FileReadingException
     */
    public Map< String, Long> countWords(Path filePath) throws FileReadingException;
    
}
