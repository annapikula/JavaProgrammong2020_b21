package Day15_Scanner;

import java.util.Scanner;

public class ScannerInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Scanner object called scanner
        System.out.println("Enter number one: ");

        int numOne = scanner.nextInt();

        System.out.println("Enter number two");
        int numTwo = scanner.nextShort();

        System.out.println("numbe4r one is: " + numOne);
        System.out.println("mumber two is: "+ numTwo);
        System.out.println("sum " +(numOne + numTwo ));


    }
}
