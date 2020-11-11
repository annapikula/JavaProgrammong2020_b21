package Day23_NestedLoop;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java";
        String word = "Java";
        String word1 = word.toLowerCase();

        String temp = sentence.toLowerCase();// java java java
        int count = 0;

        while(temp.contains(word1)){

            temp = temp.replaceFirst(word1,"");
            count++;

        }

        System.out.println(count);


    }
}
