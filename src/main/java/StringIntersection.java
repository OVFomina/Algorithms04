public class StringIntersection {

    public static String stringIntersection(String str1, String str2) {
        String stringIntersection = "";
        int i = 0;
        int j = 0;
        do {
            if (str1.charAt(i) == str2.charAt(j)) {
                stringIntersection = str1.substring(i, i + 1);
                if (str1.charAt(i + 1) == str2.charAt(j + 1)) {
                    stringIntersection = str1.substring(i, i + 2);
                }
            }
            i++;
        } while (i < str1.length());

        return stringIntersection;
    }
}
