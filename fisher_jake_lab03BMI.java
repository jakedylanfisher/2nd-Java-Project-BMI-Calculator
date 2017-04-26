import java.util.Scanner;

 

// BMI Calculator in Java

// Uses metric units

public class BMICalculatorInMetric {

 

    public static void main(String[] args) throws Exception {

        calculateBMI();

    }

 

    private static void calculateBMI() throws Exception {

        System.out.print("Please enter your weight in kg: "); // User input for weight

        Scanner s = new Scanner(System.in);

        float weight = s.nextFloat();

        System.out.print("Please enter your height in cm: ");  // User input for height

        float height = s.nextFloat();

         

        // multiplication by 100*100 for cm to m conversion

        float bmi = (100*100*weight)/(height*height);

         

        System.out.println("Your BMI is: "+bmi); // Prints out statement showing your BMI

        printBMICategory(bmi);

         

    }

     

    // Prints BMI category

    private static void printBMICategory(float bmi) {

        if(bmi < 18.5) {

            System.out.println("You are underweight");

        }else if (bmi < 25) {

            System.out.println("You are normal");

        }else if (bmi < 30) {

            System.out.println("You are overweight");

        }else {

            System.out.println("You are obese");

        }

    }

}

