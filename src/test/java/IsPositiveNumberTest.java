import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Test
    public void testIsPositiveNumberHappyPathPositiveNumber() {
        int number = 555;
        boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberHappyPathNegativeNumber() {
        int number = -555;
        boolean expectedResult = false;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberHappyPathZero() {
        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberIsOne() {
        int number = 1;
        boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberIsMinusOne() {
        int number = -1;
        boolean expectedResult = false;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
