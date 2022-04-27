import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Test
    public void testSumArray() { //happy-path
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayNegativeNumbers() { //happy-test
        int[] array = {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayZeroNumbers() { //happy-test
        int[] array = {0, 0};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
