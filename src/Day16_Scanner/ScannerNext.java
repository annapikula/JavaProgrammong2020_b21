package Day16_Scanner;

import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your first name ");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Full name is: " + firstName +  " " + lastName );
    }
}
