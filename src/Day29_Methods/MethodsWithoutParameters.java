package Day29_Methods;

public class MethodsWithoutParameters {
    public static void main(String[] args) {

        printHello5Times();
        System.out.println("Anna");
        printHello5Times();
        System.out.println("Cyberket");
        printHello5Times();

        MethodsWithoutParameters2.printOddNumbers1To100();



    }

    // AccessModifier specifier returnTYPE MEthodName (parameter){

    public static void printHello5Times(){
        for(int i = 1; i <=5; i++){
            System.out.println("Hello");}
    }


}

