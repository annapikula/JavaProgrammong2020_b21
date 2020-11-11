package Day26_Arrays;

import java.util.Arrays;

public class ArrayDescendindig {
    public static void main(String[] args){

        int[] arr = {5,1,2,6,7,0};

        Arrays.sort(arr);

        System.out.println( Arrays.toString(arr) ); // 0,1,2,5,6,7
                                                    // 0,1,2,3,4,5
        int[] descending = new int[arr.length];// [7,6,5,2,1,0



        for(int i = arr.length-1,j = 0; i > 0; i--, j++){

            // i represents index number from  end
            // j represents index from 0
            // when i decreases during loop, j will increase

           //System.out.println(arr[i] + " ");
            descending[j] = arr[i];
            j++;
        }





    }
}
