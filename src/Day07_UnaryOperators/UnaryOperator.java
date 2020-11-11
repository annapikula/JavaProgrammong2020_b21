package Day07_UnaryOperators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class UnaryOperator {
    public static void main(String[] args) {

        int a = -100;
        boolean isPositive = a > 0;

        boolean isNegative  = a < 0;

        System.out.println(a +" is positive: " + isPositive );
        System.out.println(a +" is negative: " + isNegative );


        int b = -100 - 20; // 120;
        int c = 10 - - 20; //10 + 20 = 30
        int d = 10 * - 4; // -40
        int f = -10 * - 4; // 40

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);

        System.out.println(" ================================= ");

        int x = 100;
        ++x; // increases the value by 1, 100 + 1 =101;;
        int o = 100;
        --o; //decreases the value by 1, 100 -1 = 99;

        int z = 30;


        System.out.println(x);
        System.out.println(--z);

        System.out.println("===================================");

        // POST:

        int a2 = 100;


        System.out.println(a2++);
        System.out.println(a2);

        int b2 = 100;

        System.out.println(b2--);//100
        System.out.println(b2);











    }
}
