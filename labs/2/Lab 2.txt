import java.util.Scanner;

public class Lab01part2 {

	public static void main(String[] args) {
		// Set up a Scanner
		Scanner input = new Scanner(System.in);
		
		// User input, setting up first variable
		System.out.print("Enter a value for ounces: ");
		// Ounces variable
		double ounces = input.nextDouble(); 
		// Grams variable
		double grams = ounces * 28.34952;
		// Lightspeed variable
		double lightspeed = 299972458;
		
		double energy = grams * Math.pow(lightspeed, 2);
		
		System.out.println(ounces + " Oz. is "+ grams + " g ");
		System.out.println ("Energy output is: " + energy);
				
	}

}
