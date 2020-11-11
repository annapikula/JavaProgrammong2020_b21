package Day25_Array;

public class UniqueChar {
    public static void main(String[] args) {

        String str = "abcababe";

        String result =  "";

        for(int j = 0; j <str.length(); j++){ // j represents the index num of str

        char ch = str.charAt(j);
        int count = 0;
        for(int i = 0; i < str.length(); i++) {// i represents index of str.
            char eachChar = str.charAt(i); // represents each character of the str

            if (eachChar == ch){
                count++;

            }
        }// count frequency of ch

       if(count == 1) {
           result += ch;
       }

       }
        System.out.println(result);




    }
}
