import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void testOddEvenHappyPathOddPositiveNumber() {
        long a = 159;
        String expectedResult = "Odd";

        OddEven oE = new OddEven();
        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathOddNegativeNumber() {
        long a = -345;
        String expectedResult = "Odd";

        OddEven oE = new OddEven();
        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathEvenPositiveNumber() {
        long a = 222222;
        String expectedResult = "Even";

        OddEven oE = new OddEven();
        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathEvenNegativeNumber() {
        long a = -1488;
        String expectedResult = "Even";

        OddEven oE = new OddEven();
        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathZero() {
        long a = 0;
        String expectedResult = "Even";

        OddEven oE = new OddEven();
        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathUndefinedPositiveNumber() {
        long a = 2147483647 + 1;
        String expectedResult = "Undefined";

        OddEven oE = new OddEven();
        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenHappyPathUndefinedNegativeNumber() {
        long a = -2147483648 - 1;
        String expectedResult = "Undefined";

        OddEven oE = new OddEven();
        String actualResult = oE.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
