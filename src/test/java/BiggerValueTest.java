import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    BiggerValue big;

    @BeforeEach
    void setUp() {
        big = new BiggerValue();
    }


    @Order(1)
    @Test
    public void testBiggerValueTestHappyPath() {
        int a = 3333;
        int b = 9999;

        int expectedResult = b;


        BiggerValue big = new BiggerValue();
        int actualResult = big.biggerValue(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testBiggerValueTestNegativPath() {
        int a = -3333;
        int b = -9999;

        int expectedResult = a;


        BiggerValue big = new BiggerValue();
        int actualResult = big.biggerValue(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testBiggerValueTestEqualValue() {
        int a = 3333;
        int b = 3333;

        int expectedResult = 0;


        BiggerValue big = new BiggerValue();
        int actualResult = big.biggerValue(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testBiggerValueTestZeroValue() {
        int a = 0;
        int b = 0;

        int expectedResult = 0;


        BiggerValue big = new BiggerValue();
        int actualResult = big.biggerValue(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }


}
