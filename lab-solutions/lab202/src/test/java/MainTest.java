import org.example.Main;
import org.example.classes.Player;
import org.example.classes.Warrior;
import org.example.classes.Wizard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    Player warrior;
    Player wizard;

    @BeforeEach
    void setUp(){
        warrior = new Warrior(80, 3, 15);
        wizard = new Wizard(20, 3, 15);

    }

    @Test
    void oddNumbers_OK(){
        int[] result = Main.oddNumbers(5);

        assertEquals(3, result.length);

        int[] arrayResult = {1,3,5};
        assertEquals(Arrays.toString(arrayResult), Arrays.toString(Main.oddNumbers(5)));
    }


    @Test
    void forbiddenWords_OK(){
        assertTrue(Main.forbidenWords("tengo la nintendo switchoooo y la play"));
    }

    @Test
    void decreaseLives_OK(){
        warrior.decrementLive();
        assertEquals(0, warrior.getLives());
    }

    @Test
    void attack_OK(){
        warrior.attack(wizard);

        assertEquals(20, wizard.getHealth());
        warrior.attack(wizard);
        System.out.println(wizard);
        assertEquals(2, wizard.getLives());
    }


}
