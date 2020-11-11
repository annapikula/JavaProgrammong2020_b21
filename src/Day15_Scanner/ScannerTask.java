package Day15_Scanner;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter  a number");

     int number = in.nextInt();

       if(number % 2 ==0){
           System.out.println(number +" is Even");
       }else{
           System.out.println(number + " is odd");
       }



    }
}
