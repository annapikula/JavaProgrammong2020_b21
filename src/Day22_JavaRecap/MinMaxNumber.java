package Day22_JavaRecap;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;
        int max = -2147483648;

       for (int i = 1; i <= 5; i++){
           System.out.println("Enter a number");
           int n = scan.nextInt();

           if (n<min){
               min = n;
           }

           if(n >max){
               max = n;
           }

       }

        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
