package Day28_MultiDimentionalArrays;

public class ArrayPractice4 {
    public static void main(String[] args) {



        String [] employeeNames = {"Asel", "Afrooz", "Safa", "Suveyda", "Rinat"};
        int[] employeeSalary = {10000, 110000, 110000, 1200, 1100};

        int max = employeeSalary[0];
        for(int each : employeeSalary){
            if(each > max){
                max = each;
            }
        } // to find the max salary

        System.out.println("Max: " +max);

        for(int i = 0; i <= employeeNames.length-1; i++){// to compare the employees salary with max salary
            if (max == employeeSalary[i]){
                System.out.println(employeeNames[i]);

            }
        }


    }
}
