public class StringToNumbersInt {

    public int[] stringToNumbers(String str) {
        int numbersCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Utils.isCharNumber(str.charAt(i))) {
                numbersCounter++;
            }
        }
        int[] intArray = new int[numbersCounter];
        numbersCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Utils.isCharNumber(str.charAt(i))) {
                intArray[numbersCounter] = Integer.parseInt(str.substring(i, i + 1));
                numbersCounter++;
            }
        }
        return intArray;
    }
}