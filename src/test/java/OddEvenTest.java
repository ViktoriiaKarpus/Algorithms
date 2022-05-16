import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {

    OddEven as;

    @BeforeEach
    void setUp() {
        as = new OddEven();
    }



    @Order(1)
    @Test

    public void oddEvenTestHappyPassPositiveOddNumber() {
        long number = 1;

        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Order(2)
    @Test
    public void oddEvenTestZeroHappyPassTwo() {
        long number = 2;

        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Order(3)
    @Test
    public void oddEvenTestTwoHappyPassThree() {
        long number = -1;

        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Order(4)
    @Test
    public void oddEvenTestLongNumber() {
        long number = -2;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(5)
    @Test
    public void oddEvenTestNegativeUndefined() {
        long number = 2147483649L;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(6)
    @Test
    public void oddEvenTestPositiveUndefined() {
        long number = 2147483648L;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}

