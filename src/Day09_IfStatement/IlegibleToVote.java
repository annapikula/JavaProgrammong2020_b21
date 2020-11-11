package Day09_IfStatement;

import java.sql.SQLOutput;

public class IlegibleToVote {
    public static void main(String[] args) {
        /*
          2. write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
        Ex:
            name = "John"
            citizenShip = "USA"
            output:
                John is eligible to vote for Donald Trump or Joe Biden?
                    true

         */

        String name = "John";
        String citizen = "USA";
        boolean vote = citizen == "USA";

        System.out.println(name + " is eligible to vote for US President \n\t" + vote );

        System.out.println("=======================================");

        String name2 = "Aaron";
                boolean isUSCitizen = true;
        boolean eligibleToVote = isUSCitizen == true;

        System.out.println(name2 + " is eligible to vote for US President \n\t" + eligibleToVote );




    }
}
