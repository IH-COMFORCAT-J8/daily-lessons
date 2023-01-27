package com.ironhack.netflix;

import com.ironhack.netflix.enums.*;
import com.ironhack.netflix.models.*;
import com.ironhack.netflix.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class AccountTest {

    @Autowired
    PlanRepository planRepository;
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    UserRepository userRepository;

    @Autowired
    MovieRepository movieRepository;
    @Autowired
    SeriesRepository seriesRepository;

    Plan plan1;
    Plan plan2;
    Plan plan3;

    Movie movie1;
    Series series1;

    Account account1;
    Account account2;

    User user1;
    User user2;
    User user3;

    @BeforeEach
    void setUp() {

        movie1 = movieRepository.save(new Movie("Harry Potter", 1997, 178));
        series1 = seriesRepository.save(new Series("Friends", 1998, 12, 80));

        //Creamos los planes
        plan1 = planRepository.save(new Plan("Premium", 15.00));
        plan2 = planRepository.save(new Plan("Ads", 5.95));
        plan3 = planRepository.save(new Plan("Full HD", 10.99));


        //Creamos las cuentas
        account1 = accountRepository.save(new Account("jaume.sanchez@ironhack.com", "1234", plan1));
        account2 = accountRepository.save(new Account("jose.caro@ironhack.com", "123456", plan2));


        //Creamos los users
        user1 = userRepository.save(new User("Rosi", Status.ONLINE, "https://myphoto", account1));
        user2 = userRepository.save(new User("Raul", Status.OFFLINE, "profile.photo", account1));
        user3 = userRepository.save(new User("Anna", Status.DISABLED, "photos.com", account2));


    }

    @AfterEach
    void tearDown() {
        /*

        userRepository.deleteAll();
        accountRepository.deleteAll();
        planRepository.deleteAll();
        seriesRepository.deleteAll();
        movieRepository.deleteAll();
         */
    }


    @Test
    void shouldCreateThreePlans_WhenSavedToDataBase() {
        Assertions.assertEquals(3, planRepository.findAll().size());
    }

    @Test
    void shouldCreateTwoAccounts_WhenSavedToDatabase() {
        Assertions.assertEquals(2, accountRepository.findAll().size());
    }

    @Test
    void shouldShowAccounts_WhenRetrievingPlans() {

        Plan plan = planRepository.findById(plan1.getId()).get();
        assertEquals(1, accountRepository.findByPlan(plan1).size());

    }

    @Test
    void shouldCreateUsers_WhenSavedToDatabase() {
        assertEquals(3, userRepository.findAll().size());

    }

    @Test
    void shouldShowUsers_WhenRetrievedAccount() {

        Account account = accountRepository.findById("jaume.sanchez@ironhack.com").get();

        assertEquals(2, account.getUsers().size());
    }

    @Test
    void shouldAssignMedia_WhenUserAddsOne() {
        User user = userRepository.findById(user1.getId()).get();
        user.addFavoriteMedia(movie1);
        user = userRepository.save(user);
        assertEquals("Harry Potter", userRepository.findById(user1.getId()).get().getFavoriteMedia().get(0).getName());


    }


}
