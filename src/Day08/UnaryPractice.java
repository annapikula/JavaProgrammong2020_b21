package Day08;

public class UnaryPractice {
    public static void main(String[] args) {
        /*
        3. manually calculate the following code fragements:
                1. int a = 100;
                   int b = -a++ + ++a - a-- * a-- % 2
                       b = -100 + 102 - 102 * 101 % 2
                       b = -100 + 102 - 10302 % 2
                       b = -100 + 102 - 0
                       b = 2
         */

        int a = 100;
        int b = -a++ + ++a - a-- * a-- % 2;

        System.out.println(b);



    }
}
