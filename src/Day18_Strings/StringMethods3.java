package Day18_Strings;

public class StringMethods3 {
    public static void main(String[] args) {
        String sentence = "Java is fun, Java is cool";

       sentence =  sentence.replace("Java","Python");

        System.out.println(sentence);

        String email = "CybertekSchool@gmail.com";

        email = email.replace("gmail", "yahoo");

        System.out.println(email);

        String essay = "Batch 20 is cool, Batch 20 is the best, Batch 20 students are awesome";

        essay = essay.replace("20","21");

        System.out.println(essay);

        String s = "I like to learn C#, C# is very cool";
        s = s.replace("C#", "Java");

        System.out.println(s);

        System.out.println("===================================");

        String r = "Cat is friendly, Cat is cute";

        r = r.replaceFirst("Cat","Dog");

        System.out.println(r);

        String t = "I like to learn Java, Because Java is cool, Java is powerful";

        t = t.replaceFirst("Java is", "Python is");

        System.out.println(t);

        t = t.replaceFirst("Java ", "C# ");

        System.out.println(t);

        String a = "Yesterday was Monday, Today is Monday and Tomorrow is going to be Monday.";

        a = a.replaceFirst("Monday,","Sunday,");
        a = a.replaceFirst("e Monday","e Tuesday.");

        System.out.println(a);

        System.out.println("==================================================");

        String emailAddress = "Cybertek_School@yahoo.com";










    }
}
