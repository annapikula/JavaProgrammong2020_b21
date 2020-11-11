package Day12_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {
        /*
        write a program that can define the age groups of a person
                 age groups are:
                        infant (1 - 2)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
         */

        int age = 0;
        String ageGroup = "";

        if(age <= 2 && age >=3 ){
            ageGroup = "infant";
        }else if (age <= 5 && age >= 3){
            ageGroup = "toddler";
        }else if ( age <= 9 && age >= 6){
            ageGroup = "Kid";
        }else if (age <= 12 && age >= 10){
            ageGroup = "Pre-Teen";
        }else if ( age <= 17 && age >=13){
            ageGroup = "Teenager";
        }else if( age <= 20 && age >= 18){
            ageGroup = "Young Adult";
        }else if ( age <= 39 && age >= 21){
            ageGroup = "Adult";
        }else if( age <= 49 && age >= 40){
            ageGroup = "Young-Middle-Aged-Adult";
        }else if (age <= 54 && age >= 50){
            ageGroup = "Middle Aged Adult";
        }else if ( age <= 64 && age >= 55){
            ageGroup = "Very Young Senior Citizen";
        }else if( age <= 74 && age >= 65){
            ageGroup = "Young Senior Citizen";
        }else if ( age <= 84 && age >= 75){
            ageGroup = "Senior Citizen";
        }else{
            ageGroup = "Old Senior Citizen";
        }

        System.out.println(ageGroup);










    }
}
