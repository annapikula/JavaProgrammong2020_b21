package Day20_ForLoop;

public class StringReverse {
    public static void main(String[] args) {

        String str = "ABCD";
                    //012

        String result = "";//

        for(int i = str.length()-1; i >= 0; i-- ){
            result += str.charAt(i);
        }

        System.out.println(result);

    }
}
