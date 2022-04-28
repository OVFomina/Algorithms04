import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class IntersectionTest {

    @Test
    public void testIntersectionHappyPath1() {
        int[] array1 = new int[] {1, 2, 4, 5, 89};
        int[] array2 = new int[] {8, 9, 4, 2};
        int[] expectedResult = new int[] {2, 4};

        Intersection i = new Intersection();
        int[] actualResult = i.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionHappyPath2() {
        int[] array1 = new int[] {1, 2, 4, 5, 8, 9};
        int[] array2 = new int[] {8, 9, -4, -2};
        int[] expectedResult = new int[] {8, 9};

        Intersection i = new Intersection();
        int[] actualResult = i.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionHappyPath3() {
        int[] array1 = new int[] {1, 2, 4, 5, 89};
        int[] array2 = new int[] {8, 9, 45};
        int[] expectedResult = new int[] {};

        Intersection i = new Intersection();
        int[] actualResult = i.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
