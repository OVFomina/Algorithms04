public class Utils {

    //массив не пустой?
    public static boolean isArrayLengthNotZero(int[] array) {
        if (array.length == 0) {

            return false;
        }

        return true;
    }

    //сумма элементов массива
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

    //возвращаем минимальное значение из всех элементов массива
    public static int returnMinValueOfArray(int[] array) {

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    //возвращаем максимальное значение из всех элементов массива
    public static int returnMaxValueOfArray(int[] array) {

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    //возвращаем среднее значение из всех элементов массива
    public static int returnAvValueOfArray(int[] array) {
        int sumOfValues = 0;
            for (int i = 0; i < array.length; i++) {
            sumOfValues += array[i];
        }
        return (sumOfValues / array.length);
    }
}
