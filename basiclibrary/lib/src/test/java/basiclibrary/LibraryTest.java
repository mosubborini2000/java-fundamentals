package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void testRoll() {
        Library sut = new Library();
        int[] result = sut.roll(5);

        sut.printroll(result);


    }

    // ... Other test methods ...


    @Test
    void testContainsDuplicates() {
        Library sut = new Library();
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 2, 4, 5};

        boolean result1 = sut.containsDuplicates(array1);
        boolean result2 = sut.containsDuplicates(array2);

        System.out.println("Array 1 contains duplicates: " + result1);
        System.out.println("Array 2 contains duplicates: " + result2);

        assertFalse(result1, "Array 1 should not contain duplicates");
        assertTrue(result2, "Array 2 should contain duplicates");
    }

    @Test
    void testAvgArrays() {
        Library sut = new Library();
        int[][] array = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6, 7},
                {3, 3, 3, 3, 3}
        };

        double expectedLowestAvg = 1.0;
        int[] expectedMinArray = {1, 2, 3, 4, 5};

        sut.avgArrays(array);

    }

}
