package Day16_Scanner;

import java.util.Scanner;

public class ScannerNextLine2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age  = input.nextInt();

        input.nextLine();// The purpose of this is to accept the Enter



        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Name: " + fullName);
        System.out.println("Age: "+ age);

    }
}
