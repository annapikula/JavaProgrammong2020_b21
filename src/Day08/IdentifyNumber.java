package Day08;

public class IdentifyNumber {
    public static void main(String[] args) {
        /*
        number = 100

        output:
            100 is positive number: true
            100 is positive number: false
            100 is  zero: false
         */

        int x = -100;

        boolean t = x > 0;
        boolean f = x < 0;
        boolean z = x == 0;

        System.out.println(x + " is positive number is: " + t);
        System.out.println(x + " is negative number is: " + f);
        System.out.println(x + " is zero is: " + z);

        int angle1 = 30;
        int angel2 = 30;
        int angle3 = 90;

        int sum = angle1 + angel2 + angle3;
        boolean triangle = sum == 180;

        System.out.println("The triangle is valid: " + triangle);









    }
}
