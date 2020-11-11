package Day21_WhileLoops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a number:");
        long num = scan.nextLong();
        long result = 1;
        // 3: 3*2*1
        // 4: 4*3*2*1
        // 5: 5*4*3*2*1

        for (long i = num; i >=1; i--){
            result *= i;

        }
        System.out.println(result);
    }
}
