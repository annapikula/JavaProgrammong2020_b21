package Day11_MultiBranchIf;

public class DaysInMonth {
    public static void main(String[] args) {

        int month = 12;
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean days31 = !days30 && !days28;
        int days = 0;
        days = 28;

        if(days28){
            System.out.println(days+ " days");

        }
        days = 30;
        if(days30){
            System.out.println(days +" days");

        }
        days = 31;
        if(days31){
            System.out.println(days +" days");
        }









    }
}
