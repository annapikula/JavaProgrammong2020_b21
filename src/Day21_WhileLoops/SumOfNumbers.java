package Day21_WhileLoops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for(int i = 0; i<1;) {
            System.out.println("Enter a number:");
            //sum += scan.nextInt();
            int num = scan.nextInt();
            sum += num;

            if(num<0){// if the user entered negative number, it will not be added in a sum
                break;
            }
            scan.close();

}

        System.out.println("sum = " + sum);




    }
}
