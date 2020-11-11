package Day10_IfElseStatement;

public class MaximumNumber {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 200;
        int n3 = 300;

        boolean n1Max = n1 >n2 && n1 >n3; // if n1 is greater than both numbers
                                          // means its the max number
        boolean n2Max = !n1Max && n2>n3;// if n1 is not the max and n2 if greater than n3
                                         // means n2 is larger
        boolean n3Max = !n1Max && !n2Max;
        String str = " is the maximum number";


        if(n1Max){
            System.out.println(n1 + str);

        }
        if(n2Max){
            System.out.println(n2 + str);
        }

        if(n3Max){

            System.out.println(n3+str);
        }





    }
}
