package Day11_MultiBranchIf;

public class NameOfTheDay {
    public static void main(String[] args) {

        int day = 3; //1~7

        String wday = "s";

        if(day == 7){
            wday = "Monday";
        }else if(day == 2){
            wday = "Tuesday";
        }else if(day == 3){
            wday = "Wednesday";
        }else if(day == 4) {
            wday = "Thursday";
        }else if(day == 5){
            wday = "Friday";
        }else if(day == 6){
            wday = "Saturday";
        }else{
            wday = "Sunday";
        }
        System.out.println(wday);

        System.out.println("======================================");

        int month = 11;
        String currentMonth = " ";

        if(month == 1){
            currentMonth = "January";
        }else if(month == 2){
            currentMonth = "February";
        }else if(month == 3){
            currentMonth = "March";
        }else if(month == 4){
            currentMonth = "April";
        }else if(month == 5){
            currentMonth = "May";
        }else if(month == 6){
            currentMonth = "June";
        }else if(month == 7){
            currentMonth = "July";
        }else if(month == 8){
            currentMonth = "August";
        }else if(month == 9){
            currentMonth = "September";
        }else if(month == 10){
            currentMonth = "October";
        }else if(month == 11){
            currentMonth = "November";
        }else if(month == 12){
            currentMonth = "December";
        }
        System.out.println(currentMonth);







    }
}
