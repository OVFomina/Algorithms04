import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsNumberMultipleThreeOrFiveTest {

    @Test
    public void testIsNumberMultipleThreeOrFiveHappyPathItIsPositiveNumber() {
        int m = 15;
        String expectedResult = "Good Number";

        IsNumberMultipleThreeOrFive inmtof = new IsNumberMultipleThreeOrFive();
        String actualResult = inmtof.isNumberMultipleThreeOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleThreeOrFiveHappyPathItIsNegativeNumber() {
        int m = -15;
        String expectedResult = "Good Number";

        IsNumberMultipleThreeOrFive inmtof = new IsNumberMultipleThreeOrFive();
        String actualResult = inmtof.isNumberMultipleThreeOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleThreeOrFiveHappyPathItIsMultipleOfThreePositiveNumber() {
        int m = 21;
        String expectedResult = "Bad Number";

        IsNumberMultipleThreeOrFive inmtof = new IsNumberMultipleThreeOrFive();
        String actualResult = inmtof.isNumberMultipleThreeOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleThreeOrFiveHappyPathItIsMultipleOfThreeNegativeNumber() {
        int m = -21;
        String expectedResult = "Bad Number";

        IsNumberMultipleThreeOrFive inmtof = new IsNumberMultipleThreeOrFive();
        String actualResult = inmtof.isNumberMultipleThreeOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleThreeOrFiveHappyPathItIsMultipleOfFivePositiveNumber() {
        int m = 25;
        String expectedResult = "Poor Number";

        IsNumberMultipleThreeOrFive inmtof = new IsNumberMultipleThreeOrFive();
        String actualResult = inmtof.isNumberMultipleThreeOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleThreeOrFiveHappyPathItIsMultipleOfFiveNegativeNumber() {
        int m = -25;
        String expectedResult = "Poor Number";

        IsNumberMultipleThreeOrFive inmtof = new IsNumberMultipleThreeOrFive();
        String actualResult = inmtof.isNumberMultipleThreeOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleThreeOrFiveHappyPathItIsNotPositiveNumber() {
        int m = 7;
        String expectedResult = "-1";

        IsNumberMultipleThreeOrFive inmtof = new IsNumberMultipleThreeOrFive();
        String actualResult = inmtof.isNumberMultipleThreeOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleThreeOrFiveHappyPathItIsNotNegativeNumber() {
        int m = -7;
        String expectedResult = "-1";

        IsNumberMultipleThreeOrFive inmtof = new IsNumberMultipleThreeOrFive();
        String actualResult = inmtof.isNumberMultipleThreeOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleThreeOrFiveHappyPathZero() {
        int m = 0;
        String expectedResult = "Good Number";

        IsNumberMultipleThreeOrFive inmtof = new IsNumberMultipleThreeOrFive();
        String actualResult = inmtof.isNumberMultipleThreeOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
