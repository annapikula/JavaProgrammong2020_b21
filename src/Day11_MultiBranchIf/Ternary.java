package Day11_MultiBranchIf;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Ternary {
    public static void main(String[] args) {
        int n = 100;
        String result = (n%2 ==0)? "Even": "Odd";

        System.out.println(result);

        System.out.println("======================");

        int age = 25;
        String citizenShip = "Usa";

        String eligibleToVote = (age > 18 && citizenShip == "Usa")? "Eligible to Vote": "not Eligible to Vote";
        System.out.println(eligibleToVote);

        System.out.println("===================");

        int age2 = 18;

        String buyAlcohol = (age2 >= 21) ?"eligible":"not eligible";

        System.out.println(buyAlcohol);

        System.out.println("===================================");

        int number = 1000;

        String s1 = (number >0)? "positive" :(number <0) ? "negative":"zero";

        System.out.println(s1);


    }
}
