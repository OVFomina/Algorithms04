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
        if (Utils.isArrayLengthNotZero(array)) {
            int minValue = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (minValue > array[i]) {
                    minValue = array[i];
                }
            }

            return minValue;
        }

        return Integer.MIN_VALUE;
    }

    //возвращаем максимальное значение из всех элементов массива
    public static int returnMaxValueOfArray(int[] array) {
        if (Utils.isArrayLengthNotZero(array)) {
            int maxValue = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (maxValue < array[i]) {
                    maxValue = array[i];
                }
            }

            return maxValue;
        }

        return Integer.MAX_VALUE;
    }

    //возвращаем среднее значение из всех элементов массива
    public static int returnAvValueOfArray(int[] array) {
        if (Utils.isArrayLengthNotZero(array)) {
            int sumOfValues = 0;
            for (int i = 0; i < array.length; i++) {
                sumOfValues += array[i];
            }

            return (sumOfValues / array.length);
        }

        return Integer.MIN_VALUE;
    }

    //возвращаем отсортированный от меньшего к большему массив
    public static int[] returnSortedArray(int[] array) {
        if (Utils.isArrayLengthNotZero(array)) {
            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < (array.length - 1); i++) {
                    if (array[i] > array[i + 1]) {
                        isSorted = false;
                        buf = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = buf;
                    }
                }
            }

            return array;
        }

        return (new int[] {});
    }

    //возвращаем отсортированный от меньшего к большему массив уникальных значений
    public static int[] returnUniqueNumbersArray(int[] intArray) {
        //создаем копию входного массива для работы с ним
        int[] copyArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            copyArray[i] = intArray[i];
        }
        //заменяем в массиве неуникальные числа на 0
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = i + 1; j < copyArray.length; j++) {
                if (copyArray[i] == copyArray[j]) {
                    copyArray[j] = 0;
                }
            }
        }
        //сортируем массив по возрастанию
        copyArray = Utils.returnSortedArray(copyArray);
        //находим количество нулей в отсортированном массиве и записываем в итоговый массив только ненулевые позиции
        int zeroCounter = 0;
        for (int i = 0; i < copyArray.length; i++){
            if (copyArray[i] == 0) {
                zeroCounter++;
            }
        }
        int[] resultArray = new int[copyArray.length - zeroCounter];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = copyArray[zeroCounter];
            zeroCounter++;
        }

        return resultArray;
    }

    //буква ли полученный char
    public static boolean isCharLetter(char ch) {

        return (((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z')));
    }

    //цифра ли полученный char
    public static boolean isCharNumber(char ch) {

        return ((ch >= '0') && (ch <= '9'));
    }

    //пробел ли полученный char
    public static boolean isCharSpace(char ch) {

        return (ch == ' ');
    }
}
