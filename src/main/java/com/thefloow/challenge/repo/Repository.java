package com.thefloow.challenge.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.thefloow.challenge.domain.Word;

public interface Repository extends MongoRepository<Word, String> {

    public Word findByFileName(String fileName);
    
}
