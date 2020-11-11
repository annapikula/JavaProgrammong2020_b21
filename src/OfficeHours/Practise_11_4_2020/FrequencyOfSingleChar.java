package OfficeHours.Practise_11_4_2020;

import java.util.Scanner;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");

        String str = scan.next();

        System.out.println("Enter a character");

        char ch =scan.next().charAt(0);
        scan.close();

        int frequency = 0;


        for(int i = 0; i <= str.length()-1; i++ ){ // i represents the index number of a String
            if(ch == str.charAt(i)){ // if the character is matched with the characters of the string
                frequency++;
            }
        }

        System.out.println(frequency);


    }
}
