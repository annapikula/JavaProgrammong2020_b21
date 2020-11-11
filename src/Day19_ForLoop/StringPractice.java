package Day19_ForLoop;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a string");

       String word =  scan.nextLine();

       scan.close();

       if(word.isEmpty()){
           System.out.println("String is empty");
       }else if(word.length() > 5){
           System.out.println(word.substring(word.length() -5));
       }else{
           System.out.println(word);
       }
    }
}
