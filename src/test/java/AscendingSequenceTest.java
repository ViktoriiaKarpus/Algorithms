import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingSequenceTestHappyPathPositiveNumber() {

        // 0, 1,2,3,4,5
        int start = 0;
        int end = 5;
        int step = 1;

        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceTestHappyPathNegativeNumber() {

        // -10, -9,-8,-7
        int start = -10;
        int end = -7;
        int step = 1;

        int[] expectedResult = {-10, -9, -8, -7};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceTestHappyPathNegativeNumbersPositiveNumber() {

        // 0, 1,2,3,4,5
        int start = -5;
        int end = 5;
        int step = 1;

        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceHappyPassTwo() {

        // 0, 1,2,3,4,5
        int start = 0;
        int end = 5;
        int step = 2;

        int[] expectedResult = {0, 2, 4};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
    @Test
    public void testAscendingSequenceStartLargeThenEnd() {

        // 0, 1,2,3,4,5
        int start = 5;
        int end = 0;
        int step = 2;

        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceNegativeStep() {

        // 0, 1,2,3,4,5
        int start = 0;
        int end = 5;
        int step = -1;

        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceStepZero() {

        // 0, 1,2,3,4,5
        int start = 5;
        int end = 0;
        int step = 0;

        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }



}
