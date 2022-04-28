import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Test
    public void testAreNumbersEqualHappyPathEqual() {
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathLower() {
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathHigher() {
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
