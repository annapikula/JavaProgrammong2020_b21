package Day26_Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AvarageNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many number?");

        int length = scan.nextInt();

        int[] numbers = new int[length];
        int sum = 0;

        for(int i = 0; i < length; i++){
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
            sum+= numbers[i];
        }


    }
}
