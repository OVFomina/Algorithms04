import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayTest {

    @Test
    public void testSortArray() {
        int[] array = new int[] {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = new int[] {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sa = new SortArray();
        int[] actualResult = sa.sortArray(array);

        Assertions.assertArrayEquals(expectedResult,expectedResult);
    }
}
