import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Test
    public void testOddIndicesHappyPath() {
        int[] expectedResult = {590, 985, 68};
        int[] array = new int[] {-45, 590, 234, 985, 12, 68};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем ожидаемый результат с фактическим
    }

    @Test
    public void testOddIndicesHappyPathOddLengthOfArray() {
        int[] expectedResult = {590, 985};
        int[] array = new int[] {-45, 590, 234, 985, 12};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем ожидаемый результат с фактическим
    }
}
