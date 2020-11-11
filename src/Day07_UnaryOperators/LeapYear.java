package Day07_UnaryOperators;

public class LeapYear {
    public static void main(String[] args) {
        /*
         1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false

         */

        int year  = 2021;
        boolean isLeapYear = year % 4 < 1;

        System.out.println(year + " is leap year is: "+ isLeapYear);


        int num = 65;

        int reminder = num%2;
        boolean divisibleBy2 = reminder<1;

        int remainderOf3 = num % 3;
        boolean divisibleBy3 = remainderOf3 < 1;


        System.out.println(num +" is divisible by 2: " + divisibleBy2);
        System.out.println(num +" is divisible by 2: " + divisibleBy3);

        //____________________________________________________________________

        int number = 30;

        boolean by2 = number % 2 <1;
        boolean by3 = number % 3 <1;
        boolean by5 = number % 5 <1;

        System.out.println( number + " is divisible by 2 "+ by2);
        System.out.println( number + " is divisible by 3 "+ by3);
        System.out.println( number + " is divisible by 5 "+ by5);












    }




}
