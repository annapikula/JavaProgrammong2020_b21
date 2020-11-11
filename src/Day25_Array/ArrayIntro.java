package Day25_Array;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class ArrayIntro {
    public static void main(String[] args) {

        String[] names = {"Azad", "Ayse", "Inna", "Erjon", "Aysel"};

        System.out.println( names [2]);

        String str1 = names[0];
        System.out.println(str1);

        int [] score = {80, 85, 90, 70, 75};

        System.out.println( names[3] +" : "+ score[3]);
        System.out.println( names[0] +" : "+ score[0]);
        System.out.println( names[1] +" : "+ score[2]);

        System.out.println("=======================================");

        for (int i = 0; i <=4; i++ ){
            System.out.println( names[i] +" : "+ score[i]);
        }




    }

}
