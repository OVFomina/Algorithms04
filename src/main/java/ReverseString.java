public class ReverseString {

    public static String reverseString(String str) {
        String strResult = "";
        for (int i = 0; i < str.length(); i++) {
            strResult = str.charAt(i) + strResult;
        }

        return strResult;
    }
}