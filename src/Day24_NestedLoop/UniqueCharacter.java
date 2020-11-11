package Day24_NestedLoop;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str = "AABCCD";

        for(int index = 0; index < str.length(); index++ ){ //index <= str.length()-1

            int frequency = 0;


            for (int inner = 0; inner < str.length(); inner++){

                if(str.charAt(index) == str.charAt(inner)){
                    frequency++;
                }


                }
                if(frequency == 1){
                    System.out.println(str.charAt(index));

            }

        }






    }
}
