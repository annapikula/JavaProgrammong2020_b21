package Day28_MultiDimentionalArrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        String [] employeeNames = {"Asel", "Afrooz", "Safa", "Suveyda", "Rinat"};
        //               index:      0        1         2        3          4

        int[] employeeSalary = {10000, 110000, 105000, 1200, 1100};
        //         index         0        1        2     3    4

        int max = employeeSalary[0];
        String nameOfMax ="";


        for(int i = 0; i <= employeeNames.length-1; i++){
            System.out.println(employeeNames[i] + " : $" + employeeSalary[i]);

            if(employeeSalary[i] > max){
                max = employeeSalary[i];
                nameOfMax = employeeNames[i];
            }
        }

        System.out.println(nameOfMax + " has the max salary: $" + max);






    }
}
