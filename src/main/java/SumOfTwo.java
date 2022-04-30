public class SumOfTwo {

    public static int[][] sumOfTwo(int[] array, int k) {
        int sumCounter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((i != j) && ((array[i] + array[j]) == k)) {
                    sumCounter++;
                }
            }
        }
        int[][] resultArray = new int[sumCounter][2];
        sumCounter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((i != j) && ((array[i] + array[j]) == k)) {
                    resultArray[sumCounter][0] = array[i];
                    resultArray[sumCounter][1] = array[j];
                    sumCounter++;
                }
            }
        }

        return resultArray;
    }
}
