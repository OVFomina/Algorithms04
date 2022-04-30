import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(
                Intersection.intersection(new int[]{1, 2, 4, 5, 89}, new int[]{8, 9, 4, 2})
        ));
        System.out.println(Arrays.toString(
                Intersection.intersection(new int[]{1, 2, 3, 4, 2, 5, 3}, new int[]{1, 3, 7, 8, 3, 5, 9, 3})
        ));
    }
}
