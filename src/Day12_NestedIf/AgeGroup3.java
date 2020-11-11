package Day12_NestedIf;

public class AgeGroup3 {
    public static void main(String[] args) {
        int age = 99;

        String ageGroup = (age <= 1)? "Infant":(age <=5)? "Toddler": (age <=9)?
                "kid":(age <= 13)? "Pre Teen": (age <= 17)? "Teenager":
                (age <= 20)? "Young adult":(age <= 39)? "Adult":
                        (age<=49)? "Young Middle Age":(age <= 54)?
                                "middle aged Adult":(age <= 64)? "Very Young Senior":
                                (age <= 74)? "Young Citizen": (age <= 84)? "Senior Citizen":
                                        "old senior citizen";

        System.out.println(ageGroup);








    }
}
