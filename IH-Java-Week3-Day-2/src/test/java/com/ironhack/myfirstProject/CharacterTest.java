package com.ironhack.myfirstProject;

import com.ironhack.myfirstProject.models.*;
import com.ironhack.myfirstProject.models.Character;
import com.ironhack.myfirstProject.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import java.util.*;

@SpringBootTest
public class CharacterTest {

    @Autowired
    WizardRepository wizardRepository;

    @Autowired
    WarriorRepository warriorRepository;

    List<Warrior> warriors;
    List<Wizard> wizards;

    @BeforeEach
    void setUp() {
        warriors = warriorRepository.saveAll(
                List.of(
                    new Warrior("Eric", 100, true, 199, 100),
                    new Warrior("Alfonso", 100, true, 199, 100),
                    new Warrior("Raul", 100, true, 199, 100),
                    new Warrior("Roberto", 100, true, 199, 100)
                )
        );
        wizards = wizardRepository.saveAll(
                List.of(
                        new Wizard("Rosi", 100, true, 40, 50),
                        new Wizard("Miguel Angel", 100, true, 40, 50),
                        new Wizard("Anna", 100, true, 40, 50),
                        new Wizard("Ramon", 100, true, 40, 50)
                )

        );
    }

    @Test
    void shouldCreateWarriorsAndWizzards() {

    }


}
