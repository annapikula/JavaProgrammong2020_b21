package Day27;

public class Reverse_String {
    public static void main(String[] args) {

        String[] names = {"C#", "C#", "Java", "Python", "Python", "C++"};

        for (String eachName: names) {
           String reverseName = "";

           for( int i = eachName.length()-1; i>=0; i--){
               reverseName += eachName.charAt(i);


           }

            System.out.println("reverseName = " + reverseName);


        }

    }
}
