package Day26_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(Arrays.toString(numbers));

        String[] classMates = {"Anna", "Julia", "Daniel","Yasin", "Adil", } ;

        System.out.println( Arrays.toString(classMates));

        System.out.println("===================================");

        // sort(array)

        int[] arr1 = {2000000,100000, 40000, 6000, 300000, 1234567, 90000};

        Arrays.sort(arr1); // does not return value, cannot be assigned to variable

        System.out.println(Arrays.toString(arr1));
        System.out.println("Max:" +arr1[arr1.length -1]);
        System.out.println("Min:" +arr1[0]);

        double[] arr2 = {1.5, 0.5, 2.5, 0, 3.5, 1.8, 10.5, 20.5, -0.75, -0.5};

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));

        System.out.println("Second minimum number: " + arr2[1]);
        System.out.println("Second maximum number: " + arr2[arr2.length-2]); // -1 -1



    }
}
