package Day09_IfStatement;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 1000;

        boolean even = number % 2 == 0;
        boolean odd = !even;
        System.out.println( 1000 + " is odd number: " + even);
        System.out.println( 1000 + " is odd number: " + odd);

        int n = 0;

        boolean isPositive = n > 0;
        boolean isNegative = n < 0;
        boolean isZero = !isPositive && !isNegative;

        System.out.println(n + " is zero; " + isZero);

        System.out.println("=======================================");

        System.out.println( false == !true);

        System.out.println(false != true && !false == true);
   //                             true  &&     true ==> true

        System.out.println( !false != false || false);
        //                    true  != false  ==> true

        System.out.println(true && true && false);// false

        System.out.println(false || false || false|| false|| true);

        System.out.println("=========================================");

        String weather = "Shinny";
        int degree = 70;

        boolean r1  = !(weather == "Rainy" || degree == 70);
        //            !("Shinny == "rainy" || 70 == 70)
        //            ! (false             ||  true)
        //             ! (true)
        //              !true ==> false;


        System.out.println(r1);


    }
}
