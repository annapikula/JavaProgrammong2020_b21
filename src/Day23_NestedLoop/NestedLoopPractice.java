package Day23_NestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {

        for(int j =1; j <= 10; j++){ // j: 1 - 8;

            for(int i = 1; i<=j; i++){ //i: 1-8;
                System.out.print('*');
            }
            System.out.println();


        }
        for(int j =9; j >= 1; j--) { // j: 1 - 8;
            for (int i = 1; i <=j; i++) { //i: 1-8;
                System.out.print('*');
            }
            System.out.println();


        }

    }
}
