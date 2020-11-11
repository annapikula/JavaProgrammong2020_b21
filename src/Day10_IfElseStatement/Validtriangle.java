package Day10_IfElseStatement;

public class Validtriangle {
    public static void main(String[] args) {

        double angle1 = 60;
        double angle2 = 30;
        double angle3 = 90;

        boolean isValid = (angle1 + angle2 + angle3) == 180;


        if(isValid){
            System.out.println("It's a valid triangle");
        }
                if(!isValid){
            System.out.println("It's not a valid triangle");

        }





    }
}
