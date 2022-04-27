public class Utils {

    //массив не пустой?
    public static boolean isArrayLengthNotZero(int[] array) {
        if (array.length == 0) {

            return false;
        }

        return true;
    }

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
}
