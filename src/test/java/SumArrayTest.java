import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {
    SumArray as;

    @BeforeEach
    void setUp() {
        as = new SumArray();
    }

    @Order(1)
    @Test
    public void testSumArrayTestHappyPath() {
        int[] array = new int[]{0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sum = new SumArray();
        int actualResult = sum.sumArray(array);
        Assertions.assertEquals(expectedResult, actualResult);

    }


    @Order(2)
    @Test
    public void testSumArrayTestHappyPathTwo() {
        int[] array = new int[]{-7, -3};
        int expectedResult = -10;

        SumArray sum = new SumArray();
        int actualResult = sum.sumArray(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(3)
    @Test
    public  void testSumArrayEmptyArray(){
        int [] array = new int[]{};
        int expectedResult = 0;

        SumArray sum = new SumArray();
        int actualResult = sum.sumArray(array);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    public  void testSumArrayZeroValuesArray(){
        int [] array = new int[]{0,0};
        int expectedResult = 0;

        SumArray sum = new SumArray();
        int actualResult = sum.sumArray(array);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
