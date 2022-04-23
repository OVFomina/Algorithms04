import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //эта аннотаци€ задает пор€док выполнени€ тестов

public class AscendingSequenceTest {

/*    @BeforeEach //что-то неправильно тут написано
    void setUp() {
        as = new AscendingSequence();
    }*/

    @Order(1)
    //@RepeatedTest(50) //аннотаци€, чтобы этот тест прогналс€ 50 раз
    @Test
    public void testAscendingSequenceHappyPathPositiveNumber() { //—начала пишем хэппи-тест Ц такой, что мы даем верные
        // параметры
        // и получаем ожидаемый результат
        //triple A pattern
        //0, 1, 2, 3, 4, 5 //устанавливаем значени€
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence(); //передаем на обработку
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем результат с ожидаемым
    }

    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathNegativeNumber() {
        int start = -10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7};

        AscendingSequence as = new AscendingSequence(); //передаем на обработку
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем результат с ожидаемым
    }

    @Order(3)
    @Test
    public void testAscendingSequenceHappyPathNegativePositiveNumber() {
        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence(); //передаем на обработку
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем результат с ожидаемым
    }

    @Test
    public void testAscendingSequenceStepTwo() {
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};

        AscendingSequence as = new AscendingSequence(); //передаем на обработку
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем результат с ожидаемым
    }

    @Test
    public void testAscendingSequenceStartLargerThanEnd() {//это не хэппи-тест - данные неверные, но результат тот,
        // что ожидаем - получаем пустой массив
        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence(); //передаем на обработку
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем результат с ожидаемым
    }

    @Test
    public void testAscendingSequenceStepIsZero() {//это не хэппи-тест - данные неверные, но результат тот,
        // что ожидаем - получаем пустой массив
        int start = 5;
        int end = 0;
        int step = 0;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence(); //передаем на обработку
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем результат с ожидаемым
    }

    @Test
    public void testAscendingSequenceNegativeStep() {//это не хэппи-тест - данные неверные, но результат тот,
        // что ожидаем - получаем пустой массив
        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence(); //передаем на обработку
        int[] actualResult = as.ascendingSequence(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult); //сравниваем результат с ожидаемым
    }
}
