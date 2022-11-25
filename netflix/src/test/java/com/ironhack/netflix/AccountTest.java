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
    PlanRepository tablePlan;
    @Autowired
    AccountRepository tableAccount;
    @Autowired
    UserRepository tableUser;

    Plan plan1;
    Plan plan2;
    Plan plan3;

    Account account1;
    Account account2;

    User user1;
    User user2;
    User user3;

    @BeforeEach
    void setUp() {
        //Creamos los planes
        plan1 = tablePlan.save(new Plan("Premium", 15.00));
        plan2 = tablePlan.save(new Plan("Ads", 5.95));
        plan3 = tablePlan.save(new Plan("Full HD", 10.99));


        //Creamos las cuentas
        account1 = tableAccount.save(new Account("jaume.sanchez@ironhack.com", "1234", plan1));
        account2 = tableAccount.save(new Account("jose.caro@ironhack.com", "123456", plan2));


        //Creamos los users
        user1 = tableUser.save(new User("Rosi", Status.ONLINE, "https://myphoto", account1));
        user2 = tableUser.save(new User("Raul", Status.OFFLINE, "profile.photo", account1));
        user3 = tableUser.save(new User("Anna", Status.DISABLED, "photos.com", account2));


    }

    @AfterEach
    void tearDown() {
        tableUser.deleteAll();
        tableAccount.deleteAll();
        tablePlan.deleteAll();
    }


    @Test
    void shouldCreateThreePlans_WhenSavedToDataBase() {
        Assertions.assertEquals(3, tablePlan.findAll().size());
    }

    @Test
    void shouldCreateTwoAccounts_WhenSavedToDatabase() {
        Assertions.assertEquals(2, tableAccount.findAll().size());
    }

    @Test
    void shouldShowAccounts_WhenRetrievingPlans() {

        Plan plan = tablePlan.findById(plan1.getId()).get();
        assertEquals(1, tableAccount.findByPlan(plan1).size());

    }

    @Test
    void shouldCreateUsers_WhenSavedToDatabase() {
        assertEquals(3, tableUser.findAll().size());

    }

    @Test
    void shouldShowUsers_WhenRetrievedAccount() {

        Account account = tableAccount.findById("jaume.sanchez@ironhack.com").get();

        assertEquals(2, account.getUsers().size());


    }







}
