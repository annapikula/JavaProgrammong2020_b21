package Day26_Arrays;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String str = "aaabbc"; // a3 b2 c1
        // Stem 1 : remove duplicates
             String nonDup = ""; // abc

        for(int i = 0; i <= str.length()-1; i++){
           String eachChar =""+ str.charAt(i); // a, a, a, b, b, c.
            if(!nonDup.contains(eachChar) ){
                nonDup += eachChar;
            }

        }

        System.out.println(nonDup);

        String result = ""; // a3b2c1

        // Step 2: find the frequency of each characters from the original string

        for(int j = 0; j <= nonDup.length()-1; j++) {// j is the index num of nonDup

            char ch = nonDup.charAt(j);// a,b,c
            int count = 0;// to contain thr frequency of char ch
            for (int i = 0; i <= str.length() - 1; i++) {// i is the index num of originalstring
                char eachChar = str.charAt(i);// a, a, a, b, b, c
                if (ch == eachChar) {
                    count++;
                }
            }


            result += "" + ch + count;
            //           'a' + 3 = a3
            //  number ==> char 'a' is num 97 in ascii table
            //                    so if not add it to an empty string it will make a number addition
        }

        System.out.println("result = " + result);



    }
}
