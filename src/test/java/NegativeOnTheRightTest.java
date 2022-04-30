import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeOnTheRightTest {

    @Test
    public void testNegativeOnTheRight() {
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        NegativeOnTheRight notr = new NegativeOnTheRight();
        int[] actualResult = notr.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
