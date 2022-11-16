import org.example.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person1;

    @BeforeEach
    void setUp(){
        person1 = new Person("02", "Pedro", 15, "developer");
    }

    @Test
    void person_setAge_exception(){
        assertThrows(IllegalArgumentException.class, ()-> new Person("01", "Juan", -15, "developer"));
    }

    @Test
    @DisplayName("Test que funciona")
    void person_setAge_OK(){
        assertEquals(15, person1.getAge());
    }

    @Test
    void clone_OK() throws CloneNotSupportedException {
        Person personClone =(Person) person1.clone();
        assertTrue(person1.equals(personClone));
    }

    @Test
    void writePerson_OK(){
        Person.writePersonToFile(person1);
    }


}
