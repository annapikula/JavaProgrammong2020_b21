package Day14_Switch_Recap;

public class IfPractice {
    public static void main(String[] args) {
        //if & else: 2 options
        int age = 14;
        if (age >= 18){
            System.out.println("you are eligible to get licence");
        }else{
            System.out.println("you are not ");
        }

        System.out.println("==================================================");

        int n1 = 100;
        int n2 = 200;

        if(n1 > n2){
            System.out.println(n1 + " is greater than "+ n2);
        }else if (n2 > n1){
            System.out.println(n2 + " is greater than "+n1);
        }else {
            System.out.println(n1 + " is equal to "+ n2);
        }



        int num = 1;
        if( num == 1) System.out.println("today is monday");
        else if(num == 2) System.out.println("Today is monday");
        else if (num == 3) System.out.println("Today is Tuesday");
        else if(num == 4) System.out.println("Today is Thursday");
        else if(num == 5) System.out.println("Today is friday");
        else if(num == 6) System.out.println("Today is Saturday");
        else System.out.println("Today is Sunday");


        int Age = 35;

        if(Age < 21){
            System.out.println("Teenager");
        }else if (Age >= 21 && Age <= 55) {
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }

        System.out.println("==================================");

        int AGE = -2;

        if(AGE >+ 1 && Age <= 150) {
            System.out.println("Teenager");
        }



    }
}
