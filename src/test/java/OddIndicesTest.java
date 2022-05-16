import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {
    OddIndices ai;

    @BeforeEach
    void setUp() {
        ai = new OddIndices();
    }


    @Order(1)
    @Test
    public void testOddIndicesTestHappyPath() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices ai = new OddIndices();
        int[] actualResult = ai.oddIndices(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

   /* @Order(2)
    @Test
    public void testOddIndicesTestNegativePathEvenResult() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {-45, 68};

        OddIndices ai = new OddIndices();
        int[] actualResult = ai.oddIndices(array);
        Assertions.assertFalse (Assertions.assertArrayEquals (expectedResult, actualResult) ;
    }*/

    @Order(3)
    @Test
    public void testOddIndicesTestNegativePathEmptyArray() {
        int[] array = {};
        int[] expectedResult = {};

        OddIndices ai = new OddIndices();
        int[] actualResult = ai.oddIndices(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testOddIndicesTestNegativePathZeroNumber() {
        int[] array = {0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0};

        OddIndices ai = new OddIndices();
        int[] actualResult = ai.oddIndices(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

   /* @Order(5)
    @Test
    public void testOddIndicesTestNegativeDifferentLengthArray() {
        int[] array = {-45, 590, 234, 985, 12, 68, 13};
        int[] expectedResult = {590, 985, 68, 13};

        OddIndices ai = new OddIndices();
        int[] actualResult = ai.oddIndices(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }*/
  /*  @Order(6)
    @Test
    public void testOddIndicesTestNegativeNumbers() {
        int[] array = {-45, 590, 234, 985, 12, 68, };
        int[] expectedResult = {-590, -985, -68, };

        OddIndices ai = new OddIndices();
        int[] actualResult = ai.oddIndices(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }*/
}
