package Day05_ArithmeticOperators;

public class EmployeeInfo_Concatenation {
    public static void main(String[] args) {

        String firstName = "Mary"; // "" for text
        String lastName = "Jane";
        String fullName = firstName + ' ' + lastName;
        char gender = 'F'; // '' for single characters
        int age = 35;
        String companyName = "Apple";
        String jobTitle = "Software Developer";
        double salary = 150000.05;
        boolean isFullTime = true;
        boolean isMarried = false;



        System.out.println("Employee' full name is: "+fullName);
        System.out.println(fullName+"' gender is: "+gender);
        System.out.println(fullName+"'s age is: "+age+"years old");
        System.out.println(fullName+"works at" +companyName);
        System.out.println(fullName+"'s job tile is: "+jobTitle);
        System.out.println( fullName+"'s salary is:$ " + salary);








    }






}
/* write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = M
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50

             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false

















 */