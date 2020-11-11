package Day09_IfStatement;

public class MaximumMinimum {
    public static void main(String[] args) {
        /*
        2. write a program that can print out the maximum number between two numbers
        Ex:
            num1 = 20;
            num2 = 30;
            output:
                30 is the maximum number
            num1 = 20;
            num2 = 20;
            output:
                both numbers are equal

         */

        int n1 = 100;
        int n2 = 200;

        boolean n1IsMax = n1 > n2;
        boolean n2IsMax = n2 > n1;
        boolean equal = !n1IsMax && !n2IsMax;
                           // n1 == n2;

        if(n1IsMax){
            System.out.println(n1 + " is maximum");

        }

        if(n2IsMax);{
        System.out.println(n2 + " is maximum");
        }

        if(equal){
            System.out.println("Both are equal");
        }

       



    }
}
