import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class IntersectionTest {

    @Test
    public void testIntersectionHappyPathPositiveNumbers() {
        int[] array1 = new int[] {1, 2, 4, 5, 89};
        int[] array2 = new int[] {8, 9, 4, 2};
        int[] expectedResult = new int[] {2, 4};

        Intersection i = new Intersection();
        int[] actualResult = i.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionHappyPathNegativeNumbers() {
        int[] array1 = new int[] {1, 2, 4, 5, 8, 9};
        int[] array2 = new int[] {8, 9, -4, -2};
        int[] expectedResult = new int[] {8, 9};

        Intersection i = new Intersection();
        int[] actualResult = i.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionHappyPathNoIntersections() {
        int[] array1 = new int[] {1, 2, 4, 5, 89};
        int[] array2 = new int[] {8, 9, 45};
        int[] expectedResult = new int[] {};

        Intersection i = new Intersection();
        int[] actualResult = i.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionHappyPathWithZero() {
        int[] array1 = new int[] {1, 2, 4, 0, 89};
        int[] array2 = new int[] {8, 0, 45};
        int[] expectedResult = new int[] {0};

        Intersection i = new Intersection();
        int[] actualResult = i.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
