public class Utils {

    //������ �� ������?
    public static boolean isArrayLengthNotZero(int[] array) {
        if (array.length == 0) {

            return false;
        }

        return true;
    }

    //����� ��������� �������
    public static int returnSumOfArray(int[] array) {
        if (isArrayLengthNotZero(array)) {
            int sumOfArray = 0;
            for (int i = 0; i < array.length; i++) {
                sumOfArray += array[i];
            }

            return sumOfArray;
        }

        return Integer.MIN_VALUE;
    }

    //���������� ����������� �������� �� ���� ��������� �������
    public static int returnMinValueOfArray(int[] array) {

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    //���������� ������������ �������� �� ���� ��������� �������
    public static int returnMaxValueOfArray(int[] array) {

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    //���������� ������� �������� �� ���� ��������� �������
    public static int returnAvValueOfArray(int[] array) {
        int sumOfValues = 0;
            for (int i = 0; i < array.length; i++) {
            sumOfValues += array[i];
        }
        return (sumOfValues / array.length);
    }
}
