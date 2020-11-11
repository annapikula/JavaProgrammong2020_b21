package Day26_Arrays;

public class MinMaxNumIArray {
    public static void main(String[] args) {
        int[] numbers = {100,189,200,3,40,500,6,7};
                     //  0 1 2 3 4 5 6

        int max = numbers[0]; //100
        for (int i = 1; i <= numbers.length-1; i++){
            if(numbers[i]>max){
                max = numbers[i];

            }
        }
        System.out.println("max is " + max);




    }
}
