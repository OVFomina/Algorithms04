import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAveHappyPathPositiveNumbers(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 2;
        int end = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveHappyPathNegativeNumbers(){
        int[] array = {-1, -2, -3};
        int start = 1;
        int end = 2;
        int[] expectedResult = {-3, -2, -2};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveStartHigherThanEnd(){
        int[] array = {-1, -2, -3};
        int start = 2;
        int end = 1;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveStartEqualsToEnd(){
        int[] array = {-1, -2, -3};
        int start = 2;
        int end = 2;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveStartIsNegative(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = -2;
        int end = 6;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveEndIsNegative(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 2;
        int end = -6;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveStartAndEndAreNegative(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = -2;
        int end = -6;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveEndIsZero(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 2;
        int end = 0;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveStartAndEndAreZero(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 0;
        int end = 0;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
