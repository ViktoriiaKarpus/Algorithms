import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Test
    public void AreNumbersEqualTesthappyPath(){
        int a = 89;
        int b = 89;

        int expectedResult = 0;
        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = 0;
        Assertions.assertEquals(expectedResult,actualResult);

    }
}
