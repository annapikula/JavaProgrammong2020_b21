package OfficeHours.Practise_11_4_2020;

public class FrequencyOfChar2 {
    public static void main(String[] args) {

        String str = "abbacaa";// a3b3c1
        String result = "";

        for(int j = 0; j<= str.length()-1; j++) {

            char ch = str.charAt(j);//         a  b  c
            int count = 0;// for the frequency 4, 2, 1

            for (int i = 0; i <= str.length() - 1; i++) { // to find the frequency of one character, by comparing it with each character

                if (ch == str.charAt(i)) {
                    count++;

                }

            }
            if(result.contains(""+ch)){// if char is already in a result we dont have to concate it
                continue;
            }

            result += "" + ch + count;
        }
        System.out.println(result);

    }
}