import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAve(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 2;
        int end = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
