public class StringToLetters {

    public static String stringToLetters(String str) {
        String resultString = "";
        for (int i = 0; i < str.length(); i++) {
            if (Utils.isCharLetter(str.charAt(i))) {
                resultString = resultString + str.substring(i, i + 1);
            }
        }

        return resultString;
    }
}
