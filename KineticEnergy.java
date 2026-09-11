import java.util.Scanner;
import java.lang.Math;

public class KineticEnergy {
    public static void main(String args []){
        double mass, velocity;

        Scanner dbl_input = new Scanner(System.in);

        System.out.print("Enter the mass of the object (kg): ");
        mass = dbl_input.nextDouble();

        System.out.print("Enter the velocity of the object (mps): ");
        velocity = dbl_input.nextDouble();

        

        System.out.println("The Kinetic Energy of the object is" + energyCalc(mass, velocity));

        dbl_input.close();
    }
    public static double energyCalc(double m, double v){
        double KE;
        KE = Math.pow(0.5 * m * v, 2);
        return KE;
    }
}
