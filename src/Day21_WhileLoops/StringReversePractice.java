package Day21_WhileLoops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class StringReversePractice {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String word = scan.nextLine();// java

        String reverseWord= "";

        int lastIndex = word.length()-1;
        
        for(int i = lastIndex; i>=0; i--){
            reverseWord += word.charAt(i);
        }

        System.out.println("reverseWord = " + reverseWord);;

        boolean isPalindrome = word.equals(reverseWord);
        System.out.println(isPalindrome);
    }
    
    
}
