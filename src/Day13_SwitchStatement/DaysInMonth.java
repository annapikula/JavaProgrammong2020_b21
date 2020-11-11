package Day13_SwitchStatement;

public class DaysInMonth {
    public static void main(String[] args) {
        int year = 2020;
        int month = 11; // 1~12

        boolean has28or29Days = month ==2;
        boolean has30days = month ==4 || month == 6 || month == 9 || month == 11;
        boolean has31days = !has30days || !has28or29Days;

        String result = "30 days";

        if(month >= 1 && month <= 12){
            if (has28or29Days){
                if(year%4==0){
                    result = "29 days";
                }else{
                    result = "28 days";
                }


            }else if(has30days){
                result = "has 30 days";
            }else{
                result = "31 Days";
            }

        }else{
            result = "Invalid Month";
        }

        System.out.println(result);





    }
}
