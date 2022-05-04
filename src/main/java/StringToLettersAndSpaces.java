public class StringToLettersAndSpaces {

    public static String stringToLettersAndSpaces(String str) {
        String resultString = "";
        for (int i = 0; i < str.length(); i++) {
            if (Utils.isCharLetter(str.charAt(i)) || (Utils.isCharSpace(str.charAt(i)))) {
                resultString = resultString + str.substring(i, i + 1);
            }
        }

        return resultString;
    }
}
