package Day22_JavaRecap;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAAAAABBBBBBBCCCCCCCCCEEEEEEEEFFFFFC";// A, A, A, B, B
        String result = "";//AB

        for(int i = 0; i <= str.length()-1; i++){
            String eachCharacter = "" + str.charAt(i);


            if(result.contains(eachCharacter)){
                continue;
            }else{
                result+=eachCharacter;
           /* if(!result.contains(eachCharacter)){
                result+=eachCharacter;*/
            }
        }

        System.out.println(result);


    }
}
