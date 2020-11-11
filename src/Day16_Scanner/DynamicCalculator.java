package Day16_Scanner;

import java.util.Scanner;

public class DynamicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// Make the scanner object

        System.out.println("Enter first number");// accepting the first number
        double num1 = input.nextDouble();

        System.out.println("Enter second number");// accepting the second number
        double num2 = input.nextDouble();

        System.out.println("Enter the operator");
        String operator = input.next();//accepting the operator

        input.close();// closing scanner

        double result = 0;
        boolean isValid = true;

        switch (operator){
            case"+":
               result = num1 + num2;
               break;
            case"-":
                result = num1 - num2;
                break;
            case"*":
                result = num1 * num2;
                break;
            case"/":
                result = num1 / num2;
                break;
            case"%":
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator");
                isValid = false;
        }
        if(isValid) {

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }








    }
}
