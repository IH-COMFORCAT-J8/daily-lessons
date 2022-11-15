import org.example.*;
import org.junit.jupiter.api.*;


public class SubjectTest {

    Subject subject;

    @BeforeEach
    void setUp() {
        subject = new Subject("Bases de datos", 5.0);
    }

    @Test
    void should_SetCorrectScore_ScoreBetween0and10() {
        Assertions.assertEquals(5.0, subject.getScore());
        subject.setScore(0);
        Assertions.assertEquals(0.0, subject.getScore());
        subject.setScore(10);
        Assertions.assertEquals(10, subject.getScore());

    }

    @Test
    void should_throwIllegalArgumentException_HigherOrLower() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> subject.setScore(-50));
        Assertions.assertThrows(IllegalArgumentException.class, () -> subject.setScore(-0.01));
        Assertions.assertThrows(IllegalArgumentException.class, () -> subject.setScore(10.1));
    }

}
