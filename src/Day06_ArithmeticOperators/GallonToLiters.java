package Day06_ArithmeticOperators;

public class GallonToLiters {
    public static void main(String[] args) {
        double gallon = 120.5;
        double litters = gallon *3.78541;

        System.out.println(gallon+" gallons equal to "+ litters +" L.");

        boolean exceeded300Liters = litters > 300;

        System.out.println(gallon + " exceeds 300 liters: " + exceeded300Liters);



    }


}
