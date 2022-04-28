import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Test
    public void testReverseArrayHappyPath() {
        int[] array = new int[] {2, 7, 3, 10};
        int[] expectedResult = new int[] {10, 3, 7, 2};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.reverseArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
