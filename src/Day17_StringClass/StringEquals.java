package Day17_StringClass;

public class StringEquals {
    public static void main(String[] args) {

        String str = "jira";
        String str2 = new String("jira");

        System.out.println(str == str2);// false
        System.out.println(str.equals(str2));//true
             //this compares the values

        System.out.println(str.equals("jira"));

        System.out.println(str.equalsIgnoreCase("Jira"));




    }
}
