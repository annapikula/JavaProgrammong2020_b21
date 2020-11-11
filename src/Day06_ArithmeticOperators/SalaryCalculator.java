package Day06_ArithmeticOperators;

import com.sun.xml.internal.org.jvnet.fastinfoset.EncodingAlgorithmIndexes;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 150000;
        double stateTaxRate = 0.09;
        double federalTaxRate = 0.25;

        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax +federalTax;

        double salaryAfterTax = salary - totalTax;

        System.out.println( "your salary is: $" + salary);
        System.out.println("State tax is: $"+ stateTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println( "your salary is: $" + salaryAfterTax);













    }








}
