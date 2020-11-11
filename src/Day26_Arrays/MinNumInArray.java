package Day26_Arrays;

public class MinNumInArray {
    public static void main(String[] args) {

        int[] numbers = {100,189,200,3,40,500,6,7};
        //  0 1 2 3 4 5 6

        int min = numbers[0]; //100
        for (int i = 0; i <= numbers.length-1; i++){
            if(numbers[i] <min){
                min = numbers[i];

            }
        }
        System.out.println("min is " + min);



    }
}
