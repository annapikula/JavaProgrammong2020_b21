package Day04_Variables;

public class SalaryAfterTax {
    public static void main(String[] args) {
        // totalTax = salary * tax
        //salary after rax = salary - totalTax

        int salary = 150000;
        double taxRate = 0.28;

        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Total Tax:");
        System.out.println( totalTax );

        System.out.println("salary after tax:");
        System.out.println( salaryAfterTax );








    }






}
