public class PeakElement {

    public int[] peakElement(int[] array) {
        if (Utils.isArrayLengthNotZero(array)) {
            int[] transitArray = new int[array.length];
            int transitArrayIndexCounter = 0;
            if (array[0] > array[1]){
                transitArray[0] = array[0];
                transitArrayIndexCounter++;
            }
            for (int i = 1; i < array.length; i++) {
                if ((array[i] > array[i - 1]) && (array[i] > array[i + 1])) {
                    transitArray[transitArrayIndexCounter] = array[i];
                    transitArrayIndexCounter++;
                }
            }
            int[] resultArray = new int[transitArrayIndexCounter];
            for (int i = 0; i < transitArrayIndexCounter; i++) {
                resultArray[i] = transitArray[i];
            }

            return resultArray;
        }

        return (new int[] {});
    }
}
