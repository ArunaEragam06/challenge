package com.thefloow.challenge.service;

import java.nio.file.Path;
import java.util.List;

import com.thefloow.challenge.exception.FileReadingException;

/**
 * Split the large file in to smaller chunks
 * Store Small Chunks in temp location (To Save Memory Space)
 * return the list of absolute path of chunk files .
 */
public interface FileSplitterService {

    /**
     * Split a file into multiples files.
     *
     * @param fileName   Name of file to be split.
     * @throws FileReadingException
     */
    public List<Path> splitFile(String fileName) throws FileReadingException;
    
}
