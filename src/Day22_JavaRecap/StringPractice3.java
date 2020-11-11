package Day22_JavaRecap;

import java.sql.SQLOutput;

public class StringPractice3 {
    public static void main(String[] args) {

        String sentence = "Capital of Canada is Washington";

        sentence.replace("Canada","United States");

        System.out.println(sentence);

        String s = "Cybertek School is in Boston, Cybertek Campus is in Mclean";
               s = s.replace("Cybertek", "MIT");

        System.out.println(s);

        String p = "I like Java and Java Java Java Java Java Java";
        p = p.replaceFirst("Java","C#");
        p= p.replaceFirst("Java","java");
        p =p.replace("Java", "");
       // p = p.replace("Java", "").replace("like", "like Java");

        System.out.println(p);

        System.out.println("=====================================");

        String str = "                    ";

        System.out.println(str.length());

        str = str.trim();

        System.out.println(str.length());

        String str2 = "             Cybertek        School      ";

        str2.trim();

        System.out.println(str2);

        System.out.println("==========================");

        String s2 = "I like to learn Java";

        System.out.println("Contains c# " + s2.toLowerCase().contains("java"));
        System.out.println(s2.equalsIgnoreCase("java"));

        System.out.println("=====================================");

        String s3 = "Cybertek School is the best";

        System.out.println(s3.toLowerCase().contains("cybertek"));

        System.out.println("Java".isEmpty());//false
        System.out.println("".isEmpty());//true

        System.out.println("=============================");
        //startsWith, endsWith

        String URL = "http://www.amazon.com";

        boolean isValid = URL.startsWith("http")&&( URL.endsWith(".com")||
                URL.endsWith("edu")|| URL.endsWith(".gov"));

        if(isValid){
            System.out.println("URL is valid");
        }else{
            System.out.println("Invalid");
        }

        String email = "Java_Masters@java.com";

        boolean validEmail = email.endsWith("gmail.com")|| email.endsWith("yahoo.com")
                || email.endsWith("hotmail.com")|| email.endsWith("outlook.con");

        if(validEmail){
            System.out.println("Valid");

        }else{
            System.out.println("Invalid");
        }





    }
}
