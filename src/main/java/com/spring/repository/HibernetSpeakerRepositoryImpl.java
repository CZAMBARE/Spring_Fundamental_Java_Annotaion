package com.spring.repository;

import com.spring.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernetSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Chetan");
        speaker.setLastName("Zambare");

        System.out.println("Cal " + cal.getTime());

        speakers.add(speaker);

        return speakers;

    }
}
