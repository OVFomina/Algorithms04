import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersTest {

    @Test
    public void testStringToNumbersHappyPath() {
        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbersInt stn = new StringToNumbersInt();
        int[] actualResult = stn.stringToNumbers(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
