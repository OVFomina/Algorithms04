public class KthLargest {

    public int kthLargest(int[] array, int k) {

        return (SortArray.sortArray(array)[array.length - k]);
    }
}
