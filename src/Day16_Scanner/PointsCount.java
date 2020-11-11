package Day16_Scanner;

import sun.swing.MenuItemLayoutHelper;

import java.util.Scanner;

public class PointsCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you live with?");
        byte numOfRoommates = input.nextByte();
        int points = 0;

        if (numOfRoommates > 0 && numOfRoommates <= 12) {

            if (numOfRoommates <= 2) {
                points++;
            }
            else if (numOfRoommates <= 3 && numOfRoommates >= 6) {
                points += 2;
            }
            {
                points += 3;
            }
            } else {
                System.out.println("Not a valid number");
            }
        System.out.println("Points: " + numOfRoommates +  points);

            System.out.println("what city do you live in");
        String city = input.next();
        System.out.println("Your city: " + city);

        System.out.println("Do you live in downtown? Yes/No");
        String downtown = input.next();

        switch (downtown){
            case "no":
                points =+1;
                break;
            case "yes":
                points =+2;
        }

        System.out.println("your total amount of points:" + points);




        }
    }
