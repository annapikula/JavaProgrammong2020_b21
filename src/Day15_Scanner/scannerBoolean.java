package Day15_Scanner;

import java.util.Scanner;

public class scannerBoolean {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter true or false");
        boolean b = input.nextBoolean();
        System.out.println("value " + b);
        System.out.println("opposite "+ !b);

    }
}
