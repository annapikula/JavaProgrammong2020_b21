package Day11_MultiBranchIf;

public class DayOfTheWeek {
    public static void main(String[] args) {
        int day = 2;

        String dayOfWeek = (day == 1)? "monday":(day == 2)? "Tueaday":(day == 3)? "Wednesday"
                :(day == 4)? "Thursday":(day == 5)? "Friday":( day == 6)?
        "Saturday":" Sunday";

        System.out.println(dayOfWeek);
    }
}
