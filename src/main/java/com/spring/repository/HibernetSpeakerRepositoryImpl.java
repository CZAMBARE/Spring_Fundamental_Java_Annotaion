package com.spring.repository;

import com.spring.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernetSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Chetan");
        speaker.setLastName("Zambare");

        speakers.add(speaker);

        return speakers;

    }
}
