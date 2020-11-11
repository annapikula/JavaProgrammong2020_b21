package Day18_Strings;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        String str = "I love Java programming";

        str = str.substring(7,11);

        System.out.println(str);

        String str2 = "Today is Monday";
        //             023456789

        String day = str2.substring(9,15);

        System.out.println(day);

        String email = "cybertek@gmail.com";
        //              0123456789

        String domain = email.substring(9,14);
        System.out.println(domain);

        String s1 = "I like movies and books";
        //           0123456789
        String word1 = s1.substring(7,13);

        System.out.println(word1);

        System.out.println("============================");

        String firstName = "cYBERtek"; //Cybertek;
        String firstChar = firstName.substring(0,1).toUpperCase();
        String rest = firstName.substring(1, firstName.length()-1+1).toLowerCase();

        System.out.println(firstChar);

        System.out.println(rest);

        firstName = firstChar + rest;

        System.out.println(firstName);

        System.out.println("=====================================");

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your first name: ");

        String f = scan.nextLine();
        f = f.substring(0,1).toUpperCase() + f.substring(1,f.length()-1+1).toLowerCase();


        System.out.println("Enter your last name: ");
        String l = scan.nextLine();
        l = l.substring(0,1).toUpperCase() + l.substring(1,l.length()).toLowerCase();

        System.out.println("First name is:" +f);
        System.out.println("Last name is: " + l);

        String fullName = f+" "+l;

        System.out.println("Full name is: " + fullName);


    }
}
