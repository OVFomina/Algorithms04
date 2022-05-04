import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Test
    public void testSumArrayHappyPathPositiveNumbers() {
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayHappyPathNegativeNumbers() {
        int[] array = {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayHappyPathMixNumbers() {
        int[] array = {0, 1, -2, 3, 4, -5};
        int expectedResult = 1;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayHappyPathOneElementArray() {
        int[] array = {3};
        int expectedResult = 3;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayHappyPathZeroAsElementOfArray() {
        int[] array = {0};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayVoidArray() {
        int[] array = {};
        int expectedResult = -2147483648;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
