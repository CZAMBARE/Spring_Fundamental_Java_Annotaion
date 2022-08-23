package com.spring.service;

import com.spring.model.Speaker;
import com.spring.repository.HibernetSpeakerRepositoryImpl;
import com.spring.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
        System.out.println("Spreaker ServiceImpl repository constuctors");
        repository = speakerRepository;
    }
    public SpeakerServiceImpl(){
        System.out.println("Spreaker ServiceImpl no args constuctors");
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();

    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("Spreaker ServiceImpl Setter");
        this.repository = repository;
    }
}
