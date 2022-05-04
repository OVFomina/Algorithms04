import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Test
    public void testOddIndicesHappyPathEvenLengthOfArray() {
        int[] array = new int[] {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем ожидаемый результат с фактическим
    }

    @Test
    public void testOddIndicesHappyPathOddLengthOfArray() {
        int[] array = new int[] {-45, 590, 234, 985, 12};
        int[] expectedResult = {590, 985};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем ожидаемый результат с фактическим
    }

    @Test
    public void testOddIndicesHappyPathOneElementArray() {
        int[] array = new int[] {12};
        int[] expectedResult = {};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем ожидаемый результат с фактическим
    }

    @Test
    public void testOddIndicesHappyPathZeroAsArrayElement() {
        int[] array = new int[] {0};
        int[] expectedResult = {};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем ожидаемый результат с фактическим
    }

    @Test
    public void testOddIndicesVoidArray() {
        int[] array = new int[] {};
        int[] expectedResult = {};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем ожидаемый результат с фактическим
    }
}
