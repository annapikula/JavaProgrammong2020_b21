package OfficeHours.Practice_11_11_2020;

public class ArrayPractice2 {
    public static void main(String[] args) {

        String [] word = {"Anna", "Level", "Lol", "Donalt", "Biden", "Amir", "Agalar", "Engin", };

        int count = 0;

        for(String each : word){
            char firstChar = each.toLowerCase().charAt(0); // a
            char lastChar = each.toLowerCase().charAt(each.length()-1);// a

            if(firstChar == lastChar){
                count++;
            }
        }

        System.out.println(count);
    }
}
