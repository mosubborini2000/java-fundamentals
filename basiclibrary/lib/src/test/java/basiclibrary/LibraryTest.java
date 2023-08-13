package basiclibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;
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

   @Test
   void testTally(){
       Library sut = new Library();
       ArrayList<String> votes = new ArrayList<>();
       votes.add("Bush");
       votes.add("Bush");
       votes.add("Bush");
       votes.add("Shrub");
       votes.add("Hedge");
       votes.add("Shrub");
       votes.add("Bush");
       votes.add("Hedge");
       votes.add("Bush");
       String result=sut.tally(votes);
       Assertions.assertEquals("Bush", result);

   }
   @Test
   void testAnlyzing_Weather_Data(){

       Library sut = new Library();
       int[][] w = {
               {66, 64, 58, 65, 71, 57, 60},
               {57, 65, 65, 70, 72, 65, 51},
               {55, 54, 60, 53, 59, 57, 61},
               {65, 56, 55, 52, 55, 62, 57}
       };
       String result=sut.analyzing_Weather_Data(w);
       Assertions.assertEquals("High:72\n" +
               "Low :51\n" +
               "Never saw temperature:63\n" +
               "Never saw temperature:67\n" +
               "Never saw temperature:68\n" +
               "Never saw temperature:69\n" , result);




   }


}
