package Day08;

public class GallonsToLiters {
    /*
     write a program that converts the given number of gallons to liters.
                Note: MUST return integer result

                Ex:
                    gallons: 100
                    output:
                        100 gallons equal to 378 liters
                Hint: 1 gallon = 3.785 liters
     */

    public static void main(String[] args) {

        int gallons =  100;
        double liters = gallons * 3.785;
        int result = (int)liters;

        System.out.println(gallons + " equal to: " + result );
        System.out.println(gallons + " equal to: " + (int)(gallons * 3.785) );

        /*
        2. write a program that can convert the given number of kg to pounds
            Note: MUST return integer result
            Ex:
                kg = 100;
                output:
                    10 kg equal to 220 pounds
            Hint: 1kg = 2.20462 pounds
         */


        int kg = 100;
        int pounds = (int)(kg * 2.20462);


        System.out.println(kg + " kg equal to " + pounds);












    }





}
