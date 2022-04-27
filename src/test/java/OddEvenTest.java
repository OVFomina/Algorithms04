import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void testOddEvenHappyPath() { //������� ����� �����-���� (������ ��������� �� ����� + ���������
        // ��������� �� ������
        long a = 2147483648L;
        String expectedResult = "Undefined";

        OddEven oE = new OddEven(); //�������� �� ��������� ����� ������ ������������ ������
        String actualResult = oE.oddEven(a); //���������� ����������� ��������� ����� ����� ������

        Assertions.assertEquals(expectedResult, actualResult); //���������� ��������� ��������� � �����������
    }
}
