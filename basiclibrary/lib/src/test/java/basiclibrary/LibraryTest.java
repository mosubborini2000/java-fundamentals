package basiclibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void testRoll() {
        Library sut = new Library();
        int[] result = sut.roll(3);
        int[] result2 = sut.roll(5);

        Assertions.assertEquals(3 , result.length);
        Assertions.assertEquals(5 , result2.length);


    }




    @Test
    void testContainsDuplicates() {
        Library sut = new Library();
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 2, 4, 5};

        boolean result1 = sut.containsDuplicates(array1);
        boolean result2 = sut.containsDuplicates(array2);


        Assertions.assertEquals(false,result1);
        Assertions.assertEquals(true,result2);

    }

    @Test
    void  testCalcAvg(){
    Library sut = new Library();
    //Act
    int[] arr = {1, 2, 3,6,3};
    double result = sut.avg(arr);

    //Assert
    Assertions.assertEquals(3,result);



}
    @Test
    void testAvgArrays() {
        Library sut = new Library();

        int[][] arr = {
                {1, 2, 3, 4 ,5},
                {4, 4, 3, 2, 4},
                {1, 6, 1, 6, 9}
        };
         int [] result = sut.avgArrays(arr);

        //Assert
        Assertions.assertEquals(arr[0],result);

    }

}
