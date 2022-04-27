public class OddIndices {

    public int[] oddIndices(int[] array) {
        if (Utils.isArrayLengthNotZero(array)) {
            int oddIndicesArrayLength = array.length / 2;
            int[] oddIndices = new int[oddIndicesArrayLength];
            oddIndicesArrayLength = 0;
            for (int i = 1; i < array.length; i += 2) {
                oddIndices[oddIndicesArrayLength] = array[i];
                oddIndicesArrayLength++;
            }

            return oddIndices;
        }

        return null;
    }
}
