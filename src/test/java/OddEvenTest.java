import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void testOddEvenHappyPath() { //Сначала пишем хэппи-тест (верные параметры на входе + ожидаемый
        // результат на выходе
        long a = 2147483648L;
        String expectedResult = "Undefined";

        OddEven oE = new OddEven(); //передаем на обработку новый объект тестируемого класса
        String actualResult = oE.oddEven(a); //записываем фактический результат через вызов метода

        Assertions.assertEquals(expectedResult, actualResult); //сравниваем ожидаемый результат с фактическим
    }
}
