package Day12_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 3;
        String day = " ";

        if (number >= 1 && number <= 7) {
            if (number == 1) {
                day = "Monday";
            } else if (number == 2) {
                day = "Tueaday";
            } else if (number == 3) {
                day = "Wednesday";
            } else if (number == 4) {
                day = "Thursday";
            } else if (number == 5) {
                day = "Friday";
            } else if (number == 6) {
                day = "Saturday";
            } else if (number == 7) {
                day = "sunday";
            } else {
                System.out.println("invalid data");
            }
        }
        System.out.println(day);
        }
    }
