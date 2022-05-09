import java.util.Locale;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {
        str = str.toLowerCase(Locale.ROOT);
        String resultString = "";
        String[] strArray = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            strArray[i] = str.substring(i, i + 1);
        }
        for (int i = 0; i < strArray.length; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].equals(strArray[j])) {
                    strArray[j] = "";
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            resultString += strArray[i];
        }

        return resultString;
    }
}
