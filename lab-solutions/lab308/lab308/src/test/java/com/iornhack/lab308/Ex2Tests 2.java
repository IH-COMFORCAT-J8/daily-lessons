package com.iornhack.lab308;

import com.iornhack.lab308.Models2.*;
import com.iornhack.lab308.Repositories2.ConferenceRepository;
import com.iornhack.lab308.Repositories2.ExpositionRepository;
import com.iornhack.lab308.Repositories2.GuestRepository;
import com.iornhack.lab308.Repositories2.SpeakerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Ex2Tests {

    @Autowired
    ConferenceRepository conferenceRepository;
    @Autowired
    ExpositionRepository expositionRepository;
    @Autowired
    GuestRepository guestRepository;
    @Autowired
    SpeakerRepository speakerRepository;

    Conference conference;
    Exposition exposition;
    Guest guest1;
    Guest guest2;
    Speaker speaker;

    @BeforeEach
    void setUp(){
        conference = conferenceRepository.save(new Conference(LocalDate.now(),2.5,"Barcelona", "Intro to java"));
        exposition = expositionRepository.save(new Exposition(LocalDate.now(), 2.5, "Barcelona", "Intro to SpringBoot"));
        guest1 = guestRepository.save(new Guest(Status.ATENDING, conference));
        guest2 = guestRepository.save(new Guest(Status.NO_RESPONSE, exposition));
        speaker = speakerRepository.save(new Speaker("Alejandro", 2.5, conference));
        //conference.getSpeakerList().add(speaker);
    }

    @Test
    void test1(){
        if(conferenceRepository.findById(conference.getId()).isPresent()){
            assertEquals(speaker.getName(), conferenceRepository.findById(conference.getId()).get().getSpeakerList().get(0).getName());
        }else{
            System.err.println("THe list is empty");
        }

    }

}
