package Day17_StringClass;

import java.lang.String; // This package is always imported automatically

public class StringMemory {
    public static void main(String[] args) {
        /*
        String pool:
         strOne -->    "java"  <--  strTwo
                        "Java" < ---- strFive

                  heap:
                  "java" <----- strThree
                  "java" <------ strFour


         */

        String strOne = "java"; //literal
        String strTwo = "java";//literal
        String strThree = new String ("java");
        String strFour = new String("java");

        System.out.println(strOne == strTwo);// True
        System.out.println(strOne == strThree);
        System.out.println(strThree == strFour);

        String strFive = "Java"; //made in the String pool

        System.out.println(strOne == strFive);



    }
}
