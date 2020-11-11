package Day11_MultiBranchIf;

public class GradeReport {
    public static void main(String[] args) {
        int mark = 90;// 0 ~ 100;

        String result = " ";

        if(mark < 60){
            result = "failed";

        }else if(mark >= 60 && mark < 90){
            result = "Passed";


        }else{
            result = "Passed with distinction";

        }
        System.out.println(result);

        System.out.println("===================================");

        double score = 50.5;

        String grade = " ";
        if(score >= 90){
            grade = "A";
        }else if(score >= 70 && score < 80){
            grade ="B";
        }else if(score >= 70 && score < 80){
            grade = "C";
        }else{
            grade = "F";
        }

        System.out.println(grade);

        System.out.println("==============================");

        char grade2 =' ';

        if(score >= 90){
            grade2 = 'A';
        }else if( score >= 88){
            grade2 ='B';
        }else if(score >= 70){
            grade2 = 'C';
        }else{
            grade2= 'F';
        }
        System.out.println(grade2);







    }
}
