package com.spring.service;

import com.spring.model.Speaker;
import com.spring.repository.HibernetSpeakerRepositoryImpl;
import com.spring.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();

    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
