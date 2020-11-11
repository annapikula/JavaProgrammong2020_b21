package Day10_IfElseStatement;

public class MinimumNumber {
    public static void main(String[] args) {

        int n1 = 200;
        int n2 = 2000;
        int n3 = 300;

        boolean n3IsMin = n3 < n1 && n3<n2;
        //if n1 is less than both numbers ==> n3 is Min
        boolean n2IsMin = !n3IsMin && n2 <n1;

        boolean n1IsMin = !n2IsMin && !n3IsMin;

        String str = " is minimum number";
        int min = 0;

        if(n3IsMin){
             min = n3;
            //System.out.println(n3+str);
        }

        if(n2IsMin){
            min = n2;

            //System.out.println(n2+str);
        }

        if(n1IsMin){
            min = n1;

            //System.out.println(n1+str);
        }

        System.out.println(min + str);





    }
}
