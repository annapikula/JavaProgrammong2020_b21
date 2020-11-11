package HomeWork;

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");

        String item1 = input.next();
        int count1 = input.nextInt();
        double price1 = input.nextDouble();

        System.out.println("Enter Item2, count and its price:");

        String item2 = input.next();
        int count2 = input.nextInt();
        double price2 = input.nextDouble();

        System.out.println("Enter Item3, count and its price:");

        String item3 = input.next();
        int count3 = input.nextInt();
        double price3 = input.nextDouble();

        if (count2 > 0){
            System.out.println(item1 +" Price: " + price1 +" " + item3 + " Price: " + price2);


        }
         else if(count3 > 0){

            System.out.println(item1 + " Price: " + price1 + " "+item2 + " Price: " + price3);

        }



        System.out.println("Total price: " + (price1 + price2 + price3));




    }
}
