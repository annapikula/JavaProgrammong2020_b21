package Day12_NestedIf;

public class EqualityOfNumbers {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 150;
        int n3 = 102;

        String result = " ";

        if(n1 == n2 && n2 == n3) {// becomes if not all of them are equal
            result = "all equal";
        }else if(n1 ==n2){ // if not all of them are4 equal but n1 & n2 equal
            result = " n1 & n2 are equal";
        }else if(n2 == n3){
            result = "n2 & n3 are equal";
        }else if( n1 == n3){
            result = "n1 & m3 are equal";
        }else{
            result = "none are equal";
        }
        System.out.println(result);





    }
}
