package Day21_WhileLoops;

public class SubstringMethodPractice {
    public static void main(String[] args) {
        String email = "Alexander_Tsegaye@apple.com";
        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.lastIndexOf("@");
        String lastName = email.substring(0,indexOf_);

        String firstName = email.substring(indexOf_+1,indexOfAt);

        String domain = email.substring(indexOfAt +1,email.lastIndexOf("."));

        System.out.println(lastName);
        System.out.println(firstName);
        System.out.println(domain);
    }
}
