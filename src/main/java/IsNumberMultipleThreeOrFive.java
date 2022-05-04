public class IsNumberMultipleThreeOrFive {

    public static String isNumberMultipleThreeOrFive(int m) {
        if ((m % 3 == 0) && (m % 5 == 0)) {

            return "Good Number";
        }
        if (m % 3 == 0) {

            return "Bad Number";
        }
        if (m % 5 == 0) {

            return "Poor Number";
        }

        return "-1";
    }
}
