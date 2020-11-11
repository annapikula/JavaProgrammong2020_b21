package Day15_Scanner;

import java.util.Scanner;
public class ScannerDecimal {
    public static void main(String[] args) {
        Scanner decimal = new Scanner(System.in);


        System.out.println("Enter a float number");
        float floatNumber = decimal.nextFloat();

        System.out.println("Number is "+ floatNumber);

        System.out.println("Enter a double number");
        double doubleNumber = decimal.nextDouble();
        System.out.println("number is " + doubleNumber);

        System.out.println(decimal.nextFloat() + decimal.nextFloat() );


    }
}
