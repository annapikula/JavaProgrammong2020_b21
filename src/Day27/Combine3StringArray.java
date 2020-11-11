package Day27;

import java.util.Arrays;

public class Combine3StringArray {
    public static void main(String[] args) {


        String [] group1 = {"Anna", "Branden", "jeniffer", "Hannah", "Oliver"};
        String [] group2 = {"James", "Inna", "Alina", "Nastya", "Julia", "Maria",
        "Jessica", "Lauren", "Lisa", "Sara" };
        String [] group3 = {"Muhtar", "Igor", "Ibrahim", "Sofia"};

        String[] groups = new String[group1.length + group2.length + group3.length];

        int i = 0;

        for(String each :group1){
            groups[i++] = each;
        }

        for(String each :group2){
            groups[i++] = each;
        }

        for(String each :group3) {
            groups[i++] = each;
        }
        System.out.println(Arrays.toString(groups));











    }
}
