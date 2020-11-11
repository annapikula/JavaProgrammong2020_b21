package Day28_MultiDimentionalArrays;

import java.util.Arrays;

public class ArrayPractice {
    /*
    Scrum Team
          Testers: {"Dorin" , "Adil", "Fatih", "Subhi"}
          Developers: {"Kastrinsi", "Mustafa", "Ruslan"}
          SM: {"Ayse"}
          PO: {"Omid"}
          BA: {"Agalar"}



     */
    public static void main(String[] args) {
        String[][] scrumTeam ={
                {"Dorin" , "Adil", "Fatih", "Subhi"},// 0
                {"Kastrinsi", "Mustafa", "Ruslan"},// 1
                {"Ayse"},//2
                {"Omid"},//3
                {"Agalar"}//4

        };
        System.out.println(Arrays.deepToString(scrumTeam));

        for(int i = 0; i <= scrumTeam.length-1; i++){// i index 1D arrays
            System.out.println(Arrays.toString(scrumTeam[i]) ); // prints the each group in scrum team

            for(int j = 0; j <= scrumTeam[i].length-1; j++){
                System.out.println(scrumTeam[i][j]);

            }

        }

        System.out.println("======================================");

        for(String[] eachGroup :scrumTeam){
            System.out.println(Arrays.toString(eachGroup));
            for(String eachName :eachGroup){
                System.out.println(eachName);
            }

        }


    }
}
