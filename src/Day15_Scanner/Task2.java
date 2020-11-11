package Day15_Scanner;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        byte age = input.nextByte();


        System.out.println("Enter your favorite number");
        long favoriteNumber = input.nextLong();

        System.out.println("Are you a student? true or false");
        boolean student = input.nextBoolean();

        System.out.println("my age is: "+ age + " years");
        System.out.println("My favorite number is: " + favoriteNumber);
        System.out.println("I am a student it is: " + student);

    }
}
