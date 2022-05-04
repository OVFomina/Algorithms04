import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Test
    public void testBiggerValueHappyTestPositiveNumbers() {
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueHappyTestNegativeNumbers() {
        int a = -3321;
        int b = -123;
        int expectedResult = -123;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueHappyTestMixNumbers() {
        int a = 18;
        int b = -184;
        int expectedResult = 18;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueHappyTestEqualNumbers() {
        int a = 51;
        int b = 51;
        int expectedResult = 51;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueHappyTestFirstNumberIsZero() {
        int a = 0;
        int b = 145;
        int expectedResult = 145;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueHappyTestSecondNumberIsZero() {
        int a = 111;
        int b = 0;
        int expectedResult = 111;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueHappyTestBothNumbersAreZero() {
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
