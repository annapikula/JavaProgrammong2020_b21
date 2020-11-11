package Day18_Strings;

import java.util.Scanner;

public class SubstringMethod2 {
    public static void main(String[] args) {

        String str = "Today is Monday";
        //            0123456789
        String day = str.substring(9,str.length());
        System.out.println(day);

        System.out.println("=========================================");

        Scanner scan = new Scanner(System.in);

        String firstName = scan.next();
        firstName = firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();

        System.out.println(firstName);

        System.out.println("Last Name: ");

        String lastName = scan.next();

        lastName = lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();

        System.out.println(lastName);

        System.out.println("Fullname: " + firstName + " " + lastName);

    }
}
