package Day23_NestedLoop;

public class FirstUpperLastLower {
    public static void main(String[] args) {

        String str = "CyberteK";

        char f =str.charAt(0);
        char l= str.charAt(str.length()-1);

        boolean start = f >= 'A'&& f <= 'Z';
        boolean end = l>=97 && l<= 122; // another way (ascii table)

        if(start && end){ // true && true
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
}
