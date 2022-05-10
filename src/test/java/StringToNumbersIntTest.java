import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersIntTest {

    @Test
    public void testStringToNumbersHappyPathPositiveNumbers() {
        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbersInt stn = new StringToNumbersInt();
        int[] actualResult = stn.stringToNumbersInt(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersHappyPathNegativeNumbers() {
        String str = "1, -5, 3, -7, 54";
        int[] expectedResult = {1, -5, 3, -7, 54};

        StringToNumbersInt stn = new StringToNumbersInt();
        int[] actualResult = stn.stringToNumbersInt(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersHappyPathZero() {
        String str = "1, 0, 3, 6, 8, 5";
        int[] expectedResult = {1, 0, 3, 6, 8, 5};

        StringToNumbersInt stn = new StringToNumbersInt();
        int[] actualResult = stn.stringToNumbersInt(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersFractionalNumber() {
        String str = "1, 2.5, 3, 4.7, 5";
        int[] expectedResult = {};

        StringToNumbersInt stn = new StringToNumbersInt();
        int[] actualResult = stn.stringToNumbersInt(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersHappyPathZeroAndNegativeNumbers() {
        String str = "11, -5, 3, 0, 5";
        int[] expectedResult = {11, -5, 3, 0, 5};

        StringToNumbersInt stn = new StringToNumbersInt();
        int[] actualResult = stn.stringToNumbersInt(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersFractionalNumberAndZero() {
        String str = "1, 0, 3, 4.7, 5";
        int[] expectedResult = {};

        StringToNumbersInt stn = new StringToNumbersInt();
        int[] actualResult = stn.stringToNumbersInt(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersLatinSymbols() {
        String str = "1, 2, s, 40, 5";
        int[] expectedResult = {};

        StringToNumbersInt stn = new StringToNumbersInt();
        int[] actualResult = stn.stringToNumbersInt(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersCyrillicSymbols() {
        String str = "1, 2, þ, 4, 5";
        int[] expectedResult = {};

        StringToNumbersInt stn = new StringToNumbersInt();
        int[] actualResult = stn.stringToNumbersInt(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersSpecialSymbols() {
        String str = "1, &, 22, 4, 5";
        int[] expectedResult = {};

        StringToNumbersInt stn = new StringToNumbersInt();
        int[] actualResult = stn.stringToNumbersInt(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersTextFragments() {
        String str = "1, 2, is cat red, 40, 5";
        int[] expectedResult = {};

        StringToNumbersInt stn = new StringToNumbersInt();
        int[] actualResult = stn.stringToNumbersInt(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersIntegerOverflow() {
        String str = "2147483648, 9, 1";
        int[] expectedResult = {};

        StringToNumbersInt stn = new StringToNumbersInt();
        int[] actualResult = stn.stringToNumbersInt(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
