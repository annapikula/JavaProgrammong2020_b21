package Day21_WhileLoops;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


      while(true) {
          System.out.println("Enter building number: ");
          String buildingNumber = scan.next();//220Enter

          scan.nextLine();//Enter

          System.out.println("Enter street name");
          String streetName = scan.nextLine();

          System.out.println("Enter apartment number:");
          String apartmentNumber = scan.next();

          scan.nextLine();

          System.out.println("Enter your city name");
          String cityName = scan.nextLine();

          System.out.println("Enter your state name:");
          String state = scan.nextLine();

          System.out.println("Enter your zip code:");
          int zip = scan.nextInt();

          String fullAddress = buildingNumber + " " + streetName + ", #" +
                  apartmentNumber + "\n" + cityName + ", " + state + ", " + zip;

          System.out.println(fullAddress);

          System.out.println("Would you like to continue?");
          String answer = scan.next();


          if (answer.equalsIgnoreCase("no")){
              break;
          }

      }



    }
}
