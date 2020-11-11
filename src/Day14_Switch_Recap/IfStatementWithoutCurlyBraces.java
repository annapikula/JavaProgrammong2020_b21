package Day14_Switch_Recap;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {

        int a = 10;

        if(a%2 == 0)
            System.out.println("even number");
        else
            System.out.println("odd number");

        int b = 10;

        if (b>0)
            System.out.println("Positive");
        else if (b<0)
            System.out.println("negative");
        else
            System.out.println("Zero");

        System.out.println("====================================");

        int number = 5;
        String day = "";

        if(number >=1 && number <=7){
            if(number == 1){
                day = "Monday";
            }else if(number== 2){
                day = "Tuesday";
            }else if(number == 3){
                day = "Wednesday";
            }else if (number == 4){
                day = "Thursday";
            }else if (number == 5){
                day = "Friday";
            }else if (number == 6){
                day = "Saturday";
            }else{
                day = "Sunday";
            }
        }else{
            System.out.println("invalid number");
        }

        System.out.println(day);







    }





}
