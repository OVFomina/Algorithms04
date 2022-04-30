import java.util.ArrayList;

public class Intersection {

    public static int[] intersection(int[] array1, int[] array2){
        int resultIndexCounter = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    resultIndexCounter++;
                }
            }
        }
        int[] result = new int[resultIndexCounter];
        resultIndexCounter = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    result[resultIndexCounter] = array1[i];
                    resultIndexCounter++;
                }
            }
        }

        return Utils.returnUniqueNumbersArray(result);
    }

    public static int[] intersection2(int[] array1, int[] array2){
        if (Utils.isArrayLengthNotZero(array1) && Utils.isArrayLengthNotZero(array2)) {
            int transitResultIndexCounter;
            if (array1.length > array2.length) {
                transitResultIndexCounter = array1.length;
            } else {
                transitResultIndexCounter = array2.length;
            }
            int[] transitArray = new int[transitResultIndexCounter];
            transitResultIndexCounter = 0;
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        transitArray[transitResultIndexCounter] = array1[i];
                        transitResultIndexCounter++;
                    }
                }
            }
            int[] intersectionResult = new int[transitResultIndexCounter];
            for (int i = 0; i < transitResultIndexCounter; i++) {
                intersectionResult[i] = transitArray[i];
            }

            return intersectionResult;
        }

        return (new int[] {});
    }
}
