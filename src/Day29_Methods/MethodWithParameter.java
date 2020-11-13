package Day29_Methods;

public class MethodWithParameter {
    public static void main(String[] args) {
        int age = 15;

        eligibleToBuyAlcohol(age);

        eligibleToBuyAlcohol(30);

        calculateAge(1991,2020);

    }

    public static void eligibleToBuyAlcohol(int age){
        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }

    public static void calculateAge(int birthYear, int currentYear){
        System.out.println("Your Are is: " + (currentYear - birthYear));
    }
}
