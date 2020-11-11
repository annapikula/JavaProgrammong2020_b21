package Day07_UnaryOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {
        short a = 3000;
        long b = a; // implicit casting
        // = 3000l

        //int c = b; // must be done manually

        int d = a;


        double d1 = 200.5;
        int i1 =  (int) d1; // 200


        System.out.println(i1);

        System.out.println(" =========================================================");

       long l1 = 100;
      short s1 = (short) l1;

      double d2 = 300;
      float f1 = (float) d2;

      // for mac: holding option button  = hit enter
        // windows: holding Alt  + hit enter

        long l2 = 300; // implicit casting
        //300L
        int i2 = (int) l2;
        //300

        System.out.println(" =================================");

        short s2 = 400;
        byte b1 = (byte) s2; //  - 128 - +127 (byte range) 400 > 127, cannot change the range of a limit of dadatype

        System.out.println(b1);




    }




}
