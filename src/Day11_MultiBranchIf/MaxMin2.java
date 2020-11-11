package Day11_MultiBranchIf;

public class MaxMin2 {
    public static void main(String[] args) {
        int n1 = 43;
        int n2 = 56;
        int n3 = 27;

        int max = 0;

        if(n1> n2 && n1>n2){// if n1 is greater than n2&n3
            max = n1;
        }else if(n2>n1 && n2>n3){
            max = n2;
        }else{
            max = n3;
        }

        System.out.println(max + " is Maximum number");

        System.out.println("==================================");

        String max1 = (n1 > n2 && n1 > n3)? n1 + " is maximum number":
                (n2 > n1 && n2 > n3)? n2 + " is maximum number":
                        n3 + " is maximum number";

        System.out.println(max1);

        System.out.println("================================");

        String min = (n1 < n2 && n1 < n3)? n1 + " is minimum number" :
                (n2 < n1 && n2 < n3)? n2 + " is minimum number" : n3 + " is minimum number";

        System.out.println(min);




    }
}
