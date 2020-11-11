package Day09_IfStatement;

import java.sql.SQLOutput;

public class EligibleToVote2 {
    public static void main(String[] args) {
        String name = "Jimmy";
        boolean isUSACitizen = true;
        int age = 23;
        boolean hasCriminalBackground = true;

        boolean isEligible = isUSACitizen == true && age >= 18 && hasCriminalBackground == false;

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("========================================");

        String name2 = "John";
        String c1 = "Canada";
        String c2 = "USA";

        boolean eligible = c1 == "USA" || c2 == "USA";


        System.out.println( name + " is eligible to vot: " + eligible);



    }
}
