package Day14_Switch_Recap;

public class DaysAndMonth2 {
    public static void main(String[] args) {
        int year = 2020;
        String month = "Nov";

        String result = "";

        switch (month){
            case "Feb": result = (year % 4 == 0)? "29 Days":"28Days";
               break;
            case "Apr":
            case "jun":
            case "Sep":
            case "Nov": result = "30 days";
                break;
            case "Jan":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case" Dec": result = "31 Days";
                break;
            default: result = "Invalid";

        }
        System.out.println(result);


    }
}
