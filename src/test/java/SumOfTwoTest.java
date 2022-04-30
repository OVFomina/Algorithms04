import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfTwoTest {

    @Test
    public void testSumOfTwoHappyTest() {
        int[] array = new int[] {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

/*        SumOfTwo sot = new SumOfTwo();
        int[][] actualResult = sot.sumOfTwo(array, k);*/

        int[][] actualResult = SumOfTwo.sumOfTwo(array, k);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
