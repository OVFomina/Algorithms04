public class CountWords {

    public static int countWords(String str, String sample) {
        int i = 0;
        int k = 0;
        int sampleCounter = 0;
        do {
            k = str.indexOf(sample, i);
            if (k > 0) {
                sampleCounter++;
            }
            i = k + 1;
        } while (k > 0);

        return sampleCounter;
    }
}