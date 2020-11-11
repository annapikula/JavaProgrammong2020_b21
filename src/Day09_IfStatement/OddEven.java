package Day09_IfStatement;

public class OddEven {
    public static void main(String[] args) {
        /*
        number = 100
        output: is even number


        number = 101
        output: 101 is odd number
         */
        int number = 100;

        if(number%2 == 0){
            System.out.println(number + " is even number");
        }

        int number2 = 101;

        if(number2%2 == 1){

            System.out.println( number2 + " is odd number");


            System.out.println("================================");

            int n1 = 201;

            boolean even = n1%2 == 0;
            boolean odd = !even;

            if(!odd){

                System.out.println( n1 + " is even number");
            }

        }




    }
}
