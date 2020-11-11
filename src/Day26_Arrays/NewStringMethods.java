package Day26_Arrays;

import java.util.Arrays;

public class NewStringMethods {
    public static void main(String[] args) {
        String str = "abcde";

        str.toCharArray();

        char[] array = str.toCharArray();

        System.out.println(Arrays.toString(array));

        System.out.println("====================================");

        String s1 = "acb";
        String s2 = "bdr";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

      

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        
        boolean isAnagram = Arrays.equals(ch1, ch2);

        System.out.println("isAnagram = " + isAnagram);

        String sentence = "Today is a great day";
        String[] words = sentence.split(" ");

        System.out.println( Arrays.toString(words));











    }
}
