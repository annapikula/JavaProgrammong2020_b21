package Day27;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] names = {"Delaram", "Aysel", "Snoop", "Ayse", "Erjion"};

        for (int i = 0; i <= names.length-1; i++){ // i represents index number
            System.out.println(names[i]);
        }

        System.out.println("===================================");

        for( String each : names ){ // each represents each element
            System.out.println(each);

        }

        System.out.println("==================================");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};

        int countEvens = 0;
        int countOdds = 0;

        for (int each : numbers){
            if(each % 2 ==0){
                countEvens++;

            }else{
                countOdds++;
            }
        }


        System.out.println("countOdds = " + countOdds);
        System.out.println("countEvens = " + countEvens);

        System.out.println("=====================================");

        int[] scores = {10, 2,  3, 25, 5, 100, -2, -5, 1000, 30, 40, 56};

        int max = scores[0];
        int min = scores[0];

        for (int each: scores){
            if(each > max) {
                max = each;
            }
        }

        System.out.println("max = " + max);

        for (int each: scores){
            if(each < min) {
                min = each;
            }
        }
        System.out.println("min = " + min);







    }
}
