package Day24_NestedLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 0;

        while(true){
            System.out.println("Enter a number");
            int n1 = scan.nextInt();

            System.out.println("Enter a number");
            int n2 = scan.nextInt();

            result = n1+ n2;
            System.out.println("result= " + result);


            scan.nextLine();
            System.out.println("Would ypu like to continue?");
           String a = scan.nextLine().toLowerCase();

           while( !(a.equals("yes")|| a.equals("no"))){
               System.out.println("Invalid Entry. Please, Re-Enter");
               System.out.println("Would you like to continue?");
               a = scan.nextLine().toLowerCase();
           }



           if(a.equals("no")){
               break;
           }

        }

        System.out.println("result = "+ result);




    }
}
