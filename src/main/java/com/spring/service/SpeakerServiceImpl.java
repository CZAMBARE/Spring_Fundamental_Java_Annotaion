package com.spring.service;

import com.spring.model.Speaker;
import com.spring.repository.HibernetSpeakerRepositoryImpl;
import com.spring.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    @Autowired     // Autowired with Constuctor Constructor
    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
        System.out.println("Spreaker ServiceImpl repository constuctors");
        repository = speakerRepository;
    }
    public SpeakerServiceImpl(){
        System.out.println("Spreaker ServiceImpl no args constuctors");
    }

    @PostConstruct
    private void initialize(){
        System.out.println("We are called after the constructors");
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();

    }

    /// @Autowired   - Autowired With Setter Injection
    public void setRepository(SpeakerRepository repository) {
        System.out.println("Spreaker ServiceImpl Setter");
        this.repository = repository;
    }
}
