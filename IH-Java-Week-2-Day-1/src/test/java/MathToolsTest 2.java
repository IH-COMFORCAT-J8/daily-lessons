import com.ironhack.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathToolsTest {
    
    @Test
    void math_addTwoPositiveNumbers_success() {

        assertEquals(2.0, MathTools.sum(1, 1));
        assertEquals(8.0, MathTools.sum(3, 5));
        assertEquals(7.0, MathTools.sum(5, 2));

    }

    @Test
    void math_addTwoNegativeNumbers_success() {
        assertEquals(-18.0, MathTools.sum(-8, -10));
    }

    @Test
    void math_addPositiveAndNegativeNumbers_success() {
        assertEquals(2.0, MathTools.sum(10, -8));
    }
}
