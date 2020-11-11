package Day11_MultiBranchIf;

public class DaysAndMonth2 {
    public static void main(String[] args) {
        int month = 11;
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
          //boolean days31 = !days30 && !days28;
        int days = 0;

        if(days28){
            days = 28;


        }else if(days30){
            days = 30;

        }else{
            days =31;



        }
        System.out.println(days);



    }
}
