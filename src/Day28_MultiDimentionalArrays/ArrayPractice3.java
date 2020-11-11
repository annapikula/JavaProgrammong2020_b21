package Day28_MultiDimentionalArrays;

public class ArrayPractice3 {
    public static void main(String[] args) {

        double[] salary = {100000.5, 110000.5, 120000.5, 95000.5, 90000.5};
        double sum = 0;

        for(double each : salary){
            sum += each;

        }
        System.out.println("Total: $" +sum);
        System.out.println("Avarafe Salary of employees " + (sum/salary.length) );




    }
}
