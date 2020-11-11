package Day26_Arrays;

import java.util.Scanner;

public class MInMaxInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();

        int[] numbers = new int[length];

        for(int i = 0; i <= length -1; i++){// gets the user inputs and stores into the array starting from
            System.out.println("Enter a number");
           numbers[i] = scan.nextInt();

        }

        int min = numbers[0];
        int max = numbers[0];

        for(int i = 0; i<= length -1; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }


    }
}
