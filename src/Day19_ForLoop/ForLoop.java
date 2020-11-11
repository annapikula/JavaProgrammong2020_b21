package Day19_ForLoop;
/*
for (initialization; condition; Iterator{
statements }
 */
public class ForLoop {
    public static void main(String[] args) {



        for(int i = 1; i <= 3; i++){
            System.out.println("Hello");

        }

        System.out.println("==================");

        String name = "anna";

        for(int i = 5; i > 0; i--){

            System.out.println(i+". "+name);
        }
    }
}
