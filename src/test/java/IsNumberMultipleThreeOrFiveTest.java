import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsNumberMultipleThreeOrFiveTest {

    @Test
    public void testIsNumberMultipleThreeOrFiveHappyPathItIs() {
        int m = 15;
        String expectedResult = "Good Number";

        IsNumberMultipleThreeOrFive inmtof = new IsNumberMultipleThreeOrFive();
        String actualResult = inmtof.isNumberMultipleThreeOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleThreeOrFiveHappyPathItIsMultipleOfThree() {
        int m = 21;
        String expectedResult = "Bad Number";

        IsNumberMultipleThreeOrFive inmtof = new IsNumberMultipleThreeOrFive();
        String actualResult = inmtof.isNumberMultipleThreeOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleThreeOrFiveHappyPathItIsMultipleOfFive() {
        int m = 25;
        String expectedResult = "Poor Number";

        IsNumberMultipleThreeOrFive inmtof = new IsNumberMultipleThreeOrFive();
        String actualResult = inmtof.isNumberMultipleThreeOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleThreeOrFiveHappyPathItIsNot() {
        int m = 7;
        String expectedResult = "-1";

        IsNumberMultipleThreeOrFive inmtof = new IsNumberMultipleThreeOrFive();
        String actualResult = inmtof.isNumberMultipleThreeOrFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
