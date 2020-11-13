package Day29_Methods;

import java.util.Arrays;

public class voidMethodPractice {
    public static void main(String[] args) {


        int[] a1 = {100, -200, 300, 50, 40, 59, 700, 0, 12, 6};

        arrayMaxNum(a1);

        int[] a2 = {97, 67, 500, 800, -543, 6, 5, 5};

        arrayMaxNum(a2);

        arrayMinNum(a2);
    }

    public static void arrayMaxNum(int[] arr) {
       /* Arrays.sort(arr);
        System.out.println("Maximum number: " + arr[arr.length-1]);*/
        int max = arr[0];


        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println("Maximum number is: " + max);

    }

    public static void arrayMinNum(int[] arr) {

        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }

        }

        System.out.println("Minimum number is: " + min);
    }

    public static void arrayUniqueElements(int[] arr) {
        for (int each : arr) {
            int count = 0;

            for (int each2 : arr) {
                if (each == each2) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(each + " ");
            }
        }

        System.out.println();


    }
}


