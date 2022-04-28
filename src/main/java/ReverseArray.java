public class ReverseArray {

    public int[] reverseArray(int[] array){
        if (Utils.isArrayLengthNotZero(array)) {
            int[] reversedArray = new int[array.length];
            int reversedArrayIndex = array.length - 1;
            for (int i = 0; i < array.length; i++) {
                reversedArray[reversedArrayIndex] = array[i];
                reversedArrayIndex--;
            }

            return reversedArray;
        }

        return (new int[] {});
    }
}
