package Day21_WhileLoops;

public class MiddleCharacter {
    public static void main(String[] args) {

        String word = "an";//1
        //            "javav"//2

        if(word.length()%2 !=0) {

            if (word.length() >= 3) {
                System.out.println(word.charAt(word.length() / 2));
            }else{// (word.length() == 1)
                System.out.println(word + word + word);

            }
        }else{
            //"java" ==> av ==>1,2
            if(word.length()>=4){
                int m = word.length()/2;
                System.out.println(word.charAt(m-1)+ ""+word.charAt(m));
            }else{
                System.out.println(word+word);
            }



        }




            }
}
