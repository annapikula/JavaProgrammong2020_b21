package Day25_Array;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;

        while(true) {

            System.out.println("Which room would you like to select? ");
            System.out.println("\t\t King bed == $120");
            System.out.println("\t\tQueen bed == $100");
            System.out.println("\t\tSingle bed == 80");

            String word = scan.nextLine().toLowerCase();

            while (!(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed"))) {
                System.out.println("Invalid input, Please Re-Enter!");
                word = scan.nextLine().toLowerCase();
            }


            total += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ?
                    100 : 80;



            System.out.println("would you like to select another room?");
            String a = scan.nextLine().toLowerCase();

            while(! (a.equals("no")||a.equals("yes"))){
                System.out.println("Invalid Entry. please Re-enter");
                System.out.println("Would you like to select another room?");
                a = scan.nextLine().toLowerCase();
            }

            if(a.equals("no")){
                System.out.println("Your total price is: " +total);
                break;
            }

        }



    }
}
