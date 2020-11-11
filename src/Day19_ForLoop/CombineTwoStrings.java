package Day19_ForLoop;

import java.util.Scanner;

public class CombineTwoStrings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s1 = scan.next();
        String s2 =  scan.next();

        scan.close();

        if(s1.charAt(s1.length()-1) == s2.charAt(0)){ // if lые

            System.out.println(s1+s2.substring(1));

        }else{
            System.out.println(s1+s2);
        }
        ;
        System.out.println("===========================================");

        if(s1.endsWith(s2.substring(0,1))){ //if first string ends with second character
         //   of a second string
            System.out.println(s1 + s2.substring(1));
        }else{
            System.out.println(s1+s2);
        }






    }
}
