import java.util.Scanner;

public class Lab_2 {

	public static void main(String[] args) {
		System.out.print("Please enter two numbers separated by a space: ");
		
		Scanner input = new Scanner(System.in);
		
		double numberOne = input.nextDouble();
		
		double numberTwo = input.nextDouble();
		
		System.out.println(" Is " + numberOne + " less than " + numberTwo + "?");
		System.out.println( numberOne < numberTwo );
		
		System.out.println(" Is " + numberOne + " less than or equal to " + numberTwo + "?");
		System.out.println( numberOne <= numberTwo );
		
		System.out.println(" Is " + numberOne + " equal to " + numberTwo + "?");
		System.out.println( numberOne == numberTwo );
		
		System.out.println( numberOne + " does NOT equal " + numberTwo + "?");
		System.out.println( numberOne != numberTwo );
		
		System.out.println(" Is " + numberOne + " greater than " + numberTwo + "?");
		System.out.println( numberOne > numberTwo );
		
		System.out.println(" Is " + numberOne + " greater than or equal to " + numberTwo + "?");
		System.out.println( numberOne >= numberTwo );

	}

}
