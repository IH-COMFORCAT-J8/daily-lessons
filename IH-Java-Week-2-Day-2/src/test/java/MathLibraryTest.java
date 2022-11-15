import org.example.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathLibraryTest {

    @Test
    @DisplayName("Throws exception when result larger than max integer")
    void should_ThrowException_When_ResultLargerThanMaxInt() {

        assertThrows(IllegalArgumentException.class, () -> MathLibrary.multiply(Integer.MAX_VALUE, 2));

    }

}
