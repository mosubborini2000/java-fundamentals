/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.Random;

public class Library {
    public static void main(String[] args) {
        int[][] x = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {1 ,1, 1,1,1,1 , 1 },
                {0,0,0,0,1,0,1},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        avgArrays(x);
        int[] array1 = {66, 64, 58, 65, 71, 66, 60};
        int[] array2 = {1, 2, 3, 4, 5};
        printroll(roll(5));
        boolean containsDuplicates1 = containsDuplicates(array1);
        boolean containsDuplicates2 = containsDuplicates(array2);

        System.out.println("Array 1 contains duplicates: " + containsDuplicates1);
        System.out.println("Array 2 contains duplicates: " + containsDuplicates2);

    }
    public static int[] roll (int n){
        int arr[]=new int[n];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {

            int randomNumber = random.nextInt(6) + 1;
            arr[i]=randomNumber;

        }

        return arr;
    }
    public static void printroll (int arr[]){

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);


        }

    }
    public static boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double avg(int a[]){

        double sum=0;

        int y=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
            y++;
        }
        double avg=sum/y;
        return avg;

    }
    public static void avgArrays(int[][] x) {
        int[] minArray = new int[x.length];
        double minAvg = 100000;

        for (int i = 0; i < x.length; i++) {
            double avgOfArray = avg(x[i]);
            if (avgOfArray < minAvg) {
                minAvg = avgOfArray;
                minArray = x[i];
            }
        }

        System.out.println("Lowes average " + minAvg);
        System.out.print("Minimum Array [");
        for (int i = 0; i < minArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(minArray[i]);
        }
        System.out.println("]");
    }}