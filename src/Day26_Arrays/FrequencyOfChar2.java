package Day26_Arrays;

public class FrequencyOfChar2 {
    public static void main(String[] args) {
        String str = "aaabbc";

        String expectedResult = "";// a3b2c1

        for(int j = 0; j <= str.length()-1; j++ ) {

            char ch = str.charAt(j); //'a'
            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                char eachChar = str.charAt(i);
                if (eachChar == ch) {
                    count++;
                }
            }

            expectedResult += "" + ch + count;
        }
        System.out.println(expectedResult);

    }
}
