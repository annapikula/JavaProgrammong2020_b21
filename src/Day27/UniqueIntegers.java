package Day27;

public class UniqueIntegers {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4};
        //           0 2 3 4 5 6

        for (int j = 0; j <= arr.length - 1; j++) {


            int element = arr[j]; //1
            int frequency = 0;// frequency of element

            for (int i = 0; i <= arr.length - 1; i++) {
                if (arr[i] == element) {
                    frequency++;
                }
            }

            if (frequency == 1) {// verify if the element is unique
                System.out.print(element + " ");
            }

        }
    }
}
/*
Task:
    1. write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}
            output:
                2 4

 */