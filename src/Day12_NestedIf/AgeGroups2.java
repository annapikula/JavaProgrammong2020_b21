package Day12_NestedIf;

public class AgeGroups2 {
    public static void main(String[] args) {
        int age = 45;
        String ageGroup = "";

        if(age <= 2 && age >=3 ){
            ageGroup = "infant";
        }else if (age <= 5 ){
            ageGroup = "toddler";
        }else if ( age <= 9 ){
            ageGroup = "Kid";
        }else if (age <= 12 ){
            ageGroup = "Pre-Teen";
        }else if ( age <= 17) {
            ageGroup = "Teenager";
        }else if( age <= 20){
            ageGroup = "Young Adult";
        }else if ( age <= 39 ){
            ageGroup = "Adult";
        }else if( age <= 49){
            ageGroup = "Young-Middle-Aged-Adult";
        }else if (age <= 54){
            ageGroup = "Middle Aged Adult";
        }else if ( age <= 64){
            ageGroup = "Very Young Senior Citizen";
        }else if( age <= 74){
            ageGroup = "Young Senior Citizen";
        }else if ( age <= 84){
            ageGroup = "Senior Citizen";
        }else{
            ageGroup = "Old Senior Citizen";
        }

        System.out.println(ageGroup);
    }
}
