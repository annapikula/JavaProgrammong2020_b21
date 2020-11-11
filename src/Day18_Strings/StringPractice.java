package Day18_Strings;

public class StringPractice {
    public static void main(String[] args) {

        String s1 = "Cat";
        String s2 = "Cat";
        // both are reference to one oject in string pool memory;

        System.out.println(s1 == s2);

        String s3 = new String("Cat");// new object

        System.out.println(s1 == s3);// false

        String s4 = new String("Cat");

        System.out.println(s3==s4);// false

        System.out.println(s1.equals(s3));// true because "equals' compares the value
        System.out.println(s2.equals(s4));

        String s5 = new String("cat");

        System.out.println(s4.equals(s5));// false because case sensitive
        System.out.println(s4.equalsIgnoreCase(s5));// true because ignores cases

        System.out.println("=========================================================");

        String str ="cybertek";
             str  = str.toUpperCase();// "CYBERTEK'

        System.out.println(str);

        System.out.println("===================================");

        String name = "Anna Pardue";

        int n1 = name.length();

        System.out.println(n1);

        String name2 = "anna";

        int n2 = name2.length();//4
                                // last index 3

        int lastIndex = name2.length() - 1;
        System.out.println(n2);
        System.out.println(lastIndex);

        System.out.println("=======================================");

        String a = "Java Programming Language";
        char firstChar = a.charAt(0);
        char lastChar = a.charAt(a.length() - 1);

        System.out.println("First character: " + firstChar);
        System.out.println("Last character: "+ lastChar);

        System.out.println("=========================================");

        String b = "Toiday is Monday";

        char secondChar = b.charAt(1);
        char secondLastChar = b.charAt(b.length()-2);

        System.out.println("secondChar = " + secondChar);
        System.out.println("secondLastChar = " + secondLastChar);


    }

}
