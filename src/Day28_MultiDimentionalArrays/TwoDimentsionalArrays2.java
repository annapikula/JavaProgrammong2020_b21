package Day28_MultiDimentionalArrays;

public class TwoDimentsionalArrays2 {
    public static void main(String[] args) {

        int [][] arr2D = { {1,2,30,4}, {5,6},{7,8,-9},{10,11,12},{13,14,15,16,17} };

        int max=  arr2D[0][0];
        int min = arr2D[0][0];

        for(int[] each1DArray :arr2D){
            for (int eachElement :each1DArray){

                if(eachElement > max)
                    max = eachElement;


                if (eachElement < min)
                    min = eachElement;

            }

        }

        System.out.println(max);
        System.out.println(min);




    }
}
