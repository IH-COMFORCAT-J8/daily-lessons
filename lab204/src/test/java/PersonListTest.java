import org.example.Person;
import org.example.PersonList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonListTest {

    Person person1;
    Person person2;

    PersonList personList;
    PersonList personList1;

    @BeforeEach
    void setUp(){
        person1 = new Person("02", "Pedro Pedro", 15, "developer");
        person2 = new Person("01", "Juan Juan", 15, "developer");

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        personList = new PersonList(list);

        personList1 = new PersonList();
        personList1.setPersonList(person1);
        personList1.setPersonList(person2);

    }


    @Test
    void findByName_OK(){
        assertEquals("Pedro Pedro", personList1.findByName("Pedro Pedro").getName());
    }

    @Test
    void findByName_exception(){
        assertThrows(IllegalArgumentException.class, ()-> personList1.findByName("Pedro Pedro Pedro"));
        assertThrows(IllegalArgumentException.class, ()-> personList1.findByName("Pedro Juan"));
    }


}
