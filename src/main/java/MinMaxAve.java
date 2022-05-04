public class MinMaxAve {

    public int[] minMaxAve(int[] array, int start, int end) {
        if (Utils.isArrayLengthNotZero(array) && (start >= 0) && (end > 0) && (start < end) && (end < array.length)) {
            int[] targetArray = new int[(end - start) + 1];
            int resultArrayIndex = 0;
            for (int i = start; i < (end + 1); i++) {
                targetArray[resultArrayIndex] = array[i];
                resultArrayIndex++;
            }
            int[] resultArray = new int[]{Utils.returnMinValueOfArray(targetArray),
                    Utils.returnMaxValueOfArray(targetArray),
                    Utils.returnAvValueOfArray(targetArray)};

            return resultArray;
        }

        return (new int[] {});
    }
}
