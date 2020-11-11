package OfficeHours.Practise_11_4_2020;

public class UniqueChars {
    public static void main(String[] args) {


        String str = "aabccdyyyeaac";
        String unique = ""; // "bd"
        String duplicates = "";

        for (int j = 0; j <= str.length() - 1; j++) {

            char ch = str.charAt(j);//a
            int frequency = 0;// frequency of ch

            for (int i = 0; i <= str.length() - 1; i++) {// for finding the frequency of one character at the time
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }

            if (frequency == 1) { // if frequency is 1, it means the ch is unique
                unique += ch;



            }
            if(frequency>1 && !duplicates.contains(""+ch)){
                            // && !duplicates.contains(""+ch)) // in order to contain one char only
                duplicates +=ch;
            }


        }

        System.out.println(unique);
        System.out.println(duplicates);
    }

}
