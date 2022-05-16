import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Order(1)
    @Test
    public void IsPositiveNumberTestNegativePath() {

        int a = -555;
        boolean expectedResult = true;
        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositiveNumber(a);
        Assertions.assertEquals(expectedResult, actualResult);


    }


    @Order(2)
    @Test
    public void IsPositiveNumberTestHappyPath2() {

        int a = 0;
        boolean expectedResult = false;
        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositiveNumber(a);

       Assertions.assertEquals(expectedResult, actualResult);

    }

}
