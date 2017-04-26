/**
 * This class implements a simple program that
 * will calculate my unique BMI (Body Mass Index).The equation for BMI is:
 *             w
 * BMI =   ---------
           (h/100)^2
 */



public class BMI {

   private static Object BMI = null;

public static void main(String[] args) {

       /* Part One: Declare the variables. */

       double WeightKG1;    // Variable representing my weight in kilograms.
       double HeightCENT;   // Variable representing my height in centimeters.


       /* Part Two: Do the computations. */

       WeightKG1 = 81.737345;   // My weight in kilograms.
       HeightCENT = 182.88;   // My height in centimeters.
       BMI = WeightKG1 / ((HeightCENT / 100) * (HeightCENT / 100));   // Computes BMI.

       /* Part Three: Output the results. */

       System.out.print("My body mass index is: " + BMI);   // The full printout statement of my BMI results.
       System.out.println(extracted());   // This tells the program to display the results of the BMI equation in the full printout statement.

   }

private static Object extracted() {
	return BMI;
} // end of main()

} // end of class BMI
