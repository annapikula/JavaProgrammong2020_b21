package Day29_Methods;

public class VoidMethodsPractice3 {
    public static void main(String[] args) {

        eligibleToVote("USA", 45, true);
        eligibleToVote("Japan", 78, true);

    }

    public static void eligibleToVote(String citizenShip, int age, boolean isAlive ){
        if(citizenShip.equalsIgnoreCase("USA")){
            if(isAlive){
                if(age >= 18){

                }else{
                    System.err.println("You must be 18 or older in order to vote");
                }

            }else{
                System.err.println("You must come back to live order to vote");
            }


        }else{
            System.err.println("You must to be citizen of USA");
        }

    }

}
