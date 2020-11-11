package Day07_UnaryOperators;

public class PostPre {

    public static void main(String[] args) {
        int x = 2;
        int y = x++; //post increasment shows current value

        System.out.println(x);
        System.out.println(y);

        int x2 = 8;
        int y2 = x2--;
        System.out.println(y2);

        int x4 = 8;
        int y4= x4--; //y4 = 8

        System.out.println(y4);
        System.out.println(x4);


        System.out.println("===============================");

        int a = 1; // a= 0
        int b = - a-- + a++ / -a-- * --a;
        //  b = - 1 +    0  / - 1  * - 1
        // b = -1 + 0 * 1
        // b = -1 = 0
        // b = -1

        System.out.println(b);

        System.out.println("================================");

        int A = 50;
        int B = --A + A++ + A-- +A++;
        //  B = 49  +  49 + 50  = 49
        //  B = 98  + 50  = 49
        //  B = 148 + 49
        //  B = 197

        System.out.println(B);

        System.out.println("===================================");

        int X = 4;
        int Y = X * 4 - X++;
        //  Y = 4 * 4 - 4
        //  Y = 16 - 4
        //  Y 12

        System.out.println(Y);

        System.out.println("===========================");

        int t = 100;
        int p = - ++t * - t-- / t++ + --t;
        //  p = - 101 * - 101 / 100 + 100
        //  p = 10,201 / 100 + 100;
        //  p = 102.01 + 100
        //  p = 202.01 // 202

        System.out.println(p);

        System.out.println("================================");

        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        //  W = -20 + -19 + 19 * 19 % 2;
        //  W = -20 + -19  + 361 % 2;
        //  W = -20 + - 19 + 1;
        //  W +  -39 + 1
        // W = - 38

        System.out.println(W);

        System.out.println("====================================");

        int M = 300;
        int N = 400;

        int U = ++M + N++ - M-- % 2 + --N %2;
        //  U = 301 + 400 - 301 % 2 + 400 % 2;
        //  U = 301 + 400 - 1 + 0
        //  U = 701 - 1
        //  U = 700

        System.out.println("U: " + U);

        int J = M + N - M * M/N;
        //  J = 300 + 400  - 300 * 300 / 400
        //  J = 300 + 400 - 120000/400











    }
}
