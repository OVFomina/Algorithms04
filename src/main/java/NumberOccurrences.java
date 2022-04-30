public class NumberOccurrences {

    public int[][] numberOccurrences(int[] array){
        int[] uniqueNumbersArray = Utils.returnUniqueNumbersArray(array);
        int[][] resultArray= new int[uniqueNumbersArray.length][2];
        int uniqueNumberCounter = 0;
        for (int i = 0; i < uniqueNumbersArray.length; i++) {
            uniqueNumberCounter = 0;
            for (int j = 0; j < array.length; j++) {
                if (uniqueNumbersArray[i] == array[j]) {
                    uniqueNumberCounter++;
                }
            }
            resultArray[i][0] = uniqueNumbersArray[i];
            resultArray[i][1] = uniqueNumberCounter;
        }

        return resultArray;
    }
}
