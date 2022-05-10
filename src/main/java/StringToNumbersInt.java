public class StringToNumbersInt {

    public int[] stringToNumbersInt(String str) {
        String[] strArray = str.split(", ");
        int[] intArray = new int[strArray.length];
        try {
            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }

            return intArray;
        } catch (NumberFormatException e) {

            return new int[]{};
        }
    }
}