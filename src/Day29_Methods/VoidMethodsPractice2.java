package Day29_Methods;

import java.util.Scanner;

public class VoidMethodsPractice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        sumOf3Nums(10,20,30);
        sumOf3Nums(20,45,76);
        greaterNum(78,90);

        //sumOf3Nums(scan.nextInt(), scan.nextInt(), scan.nextInt() );
    }

    public static void sumOf3Nums(int n1, int n2, int n3){
        System.out.println("Sum is: " + (n1 + n2 + n3));

    }

    public static void greaterNum(int n1, int n2){
        if(n1 > n2){
            System.out.println(n1 + " of greater");
        }else if(n1 == n2){
            System.out.println("Numbers are equal");
        }else{
            System.out.println(n2 + " is greater");
        }
    }

}
