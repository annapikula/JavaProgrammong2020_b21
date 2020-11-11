package Day23_NestedLoop;
/*
Credentials:
  cybertek
  cybertek12345

 */

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name: ");
        String userName = scan.next();

        System.out.println("Enter your password: ");
        String password = scan.next();

        if(userName.equals("cybertek")&& password.equals("cybertek12345")){
            System.out.println("Logged in");
        }else{
            for(int i = 1; i <= 3; i++ ){
                if(i==3){
                    System.err.println("Your account is locked");
                    System.exit(0);
                }
                System.out.println("Invalid username or password, please enter:");
                System.out.println("Enter your username");
                userName = scan.next();
                System.out.println("Enter your password");
                password = scan.next();
                if(userName.equals("cybertek")&& password.equals("cybertek12345")){
                    System.out.println("Logged in");
                    break;
                }


            }

        }




        System.out.println("Logged in");



    }
}
