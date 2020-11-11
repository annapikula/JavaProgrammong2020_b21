package Day14_Switch_Recap;

public class DaysAndMonth {
    public static void main(String[] args) {
        int year = 2020;
        String month = "Feb";

        String result = "";

        switch (month){
            case "Jan": result = "31 days";
                       break;
            case "Feb": result = (year % 4 == 0)?"29 days":"28 days";
                       break;
            case "Mar": result = "31 Days";
                       break;
            case "Apr": result = "30 days";
                        break;
            case "May": result = "31 days";
                        break;
            case "Jun": result = "30 days";
                         break;
            case "Jul": result = "31 days";
                          break;
            case "Aug": result = "30 days";
                          break;
            case "Sep": result = "30 days";
                         break;
            case "Oct": result = "31 days";
                         break;
            case "Nov": result = "30 Days";
                          break;
            case "Dec": result = "30 days";
                           break;
            default: result = "invalid";


                   }
        System.out.println(result);






    }
}
