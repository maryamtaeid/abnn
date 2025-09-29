package at.fhj.msd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class MathUtilsTest {
    @Test
    @DisplayName ("test is even ()")
    void isEventest(){
        assertTrue(MathUtils.isEven(8));
    }
     @Test
    @DisplayName ("test if the number is not even")
    void isNotEventest(){
        assertFalse(MathUtils.isEven(11));
        print(hi);
    }

}
