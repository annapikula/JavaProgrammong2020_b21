package Day15_Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        int numOfPeople = 75;
        int crew = 0;
        int passengers = 0;

        switch(numOfPeople){
            case 50:
                crew = 20;
                passengers = 30;
                break;
            case 75:
                crew = 25;
                passengers = 50;
                break;
            case 100:
                crew = 30;
                passengers = 70;
                break;
            default:
                System.out.println("Invalid number of people");
        }

        System.out.println("crew: " + crew + "\npassengers: " + passengers);




    }
}
