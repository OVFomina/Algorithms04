public class NegativeOnTheRight {

    public int[] negativeOnTheRight(int[] array) {
        if (Utils.isArrayLengthNotZero(array)) {
            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < (array.length - 1); i++) {
                    if ((array[i] < 0) && (array[i + 1] > 0)) {
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
}
