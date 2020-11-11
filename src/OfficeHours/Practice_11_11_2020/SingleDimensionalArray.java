package OfficeHours.Practice_11_11_2020;

import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        int[] scores = new int[5];
             //                  length = 1;
        //                        last index: 1-1 = 0;

        scores [1] = 10;
        scores[2] = 20;
        scores[0] = 50;
        scores [3] = 30;
        scores [4] = 40;

        System.out.println(Arrays.toString(scores));
        System.out.println(scores[0]);

        for (int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);

            
        }



    }
}
