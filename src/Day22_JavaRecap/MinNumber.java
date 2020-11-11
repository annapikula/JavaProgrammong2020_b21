package Day22_JavaRecap;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 789;


        for(int i = 1;i <= 5;i++ ){

            System.out.println("enter a number");
            int n = scan.nextInt();

            if(n < min){
                min = n;
            }
        }
        System.out.println(min);





    }
}
