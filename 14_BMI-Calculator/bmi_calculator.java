import java.util.Scanner;
public class bmi_calculator {
	public static void main(String[] args) {

		System.out.println("===============================");
		System.out.println("CALCULATE BODY MASS INDEX (BMI)");
		System.out.println("===============================");

		float height, weight, konversi_height, bmi;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your height in cm: ");
		height = input.nextFloat();

		System.out.print("Enter your weight in kg: ");
		weight = input.nextFloat();
		konversi_height = height/100;

		bmi = weight/(konversi_height*konversi_height);

		System.out.printf("\nYour Body Mass Index is " + bmi);
		System.out.println("");

		if (bmi <= 18.4)
			System.out.println("You are underweight.");
		else if (bmi <= 24.9)
			System.out.println("You are healthy.");
		else if (bmi <= 29.9)
			System.out.println("You are overweight.");
		else if (bmi <= 34.9)
			System.out.println("You are severely overweight.");
		else if (bmi <= 39.9)
			System.out.println("You are obese.");
		else
			System.out.println("You are severely obese.");
	}
}