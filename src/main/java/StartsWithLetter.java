import java.util.Locale;

public class StartsWithLetter {

    public static String startsWithLetter(String str, char sample) {
        sample = Character.toLowerCase(sample);
        str = str.replaceAll("\n"," ");
        String resultString = "";
        String[] stringArray = str.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            if ((stringArray[i].charAt(stringArray[i].length() - 1) == ',')
                    || (stringArray[i].charAt(stringArray[i].length() - 1) == '.')) {
                stringArray[i] = stringArray[i].substring(0, stringArray[i].length() - 1);
            }
            if ((stringArray[i].charAt(0) == sample) || (Character.toLowerCase(stringArray[i].charAt(0)) == sample)) {
                resultString += stringArray[i] + ", ";
            }
        }

        return resultString.substring(0, resultString.length() - 2);
    }
}