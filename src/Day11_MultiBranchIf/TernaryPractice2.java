package Day11_MultiBranchIf;

public class TernaryPractice2 {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 200;

        if(n1 > n2){
            System.out.println(n1 + " is max");
        }else{
            System.out.println(n2 + " is max");
        }

        System.out.println("====================");

        String max = (n1>n2)? " 100 is Max":"200 is Max";

        System.out.println(max);

        System.out.println("===========================");

        int m1 = 100;
        int m2 = 55;
        int m3 = 400;

        String min = (m1 < m2 && m1 < m3)? "100 is minimum number"
                :(m2 < m1 && m2 < m3)? m2 + " is Minimum number":
                "400 is minimum number";

        System.out.println(min);




    }
}
