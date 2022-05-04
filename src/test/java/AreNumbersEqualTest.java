import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Test
    public void testAreNumbersEqualHappyPathEqualPositiveNumbers() {
        int a = 555;
        int b = 555;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathEqualNegativeNumbers() {
        int a = -555;
        int b = -555;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathPositiveNumbersFirstLower() {
        int a = 12;
        int b = 120;
        int expectedResult = -1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathNegativeNumbersFirstLower() {
        int a = -12;
        int b = -2;
        int expectedResult = -1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathPositiveNumbersSecondLower() {
        int a = 50;
        int b = 5;
        int expectedResult = 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathNegativeNumbersSecondLower() {
        int a = -125;
        int b = -578;
        int expectedResult = 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
