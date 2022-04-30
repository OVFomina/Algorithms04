import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class KthLargestTest {

    @Test
    public void testKthLargest() {
        int[] array = new int[] {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        KthLargest kl = new KthLargest();
        int actualResult = kl.kthLargest(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
