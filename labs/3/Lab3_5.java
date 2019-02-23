import java.util.Scanner;

public class Lab3_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double a = in.nextDouble();
		
		System.out.print("Enter second number: ");
		double b = in.nextDouble();
		
		System.out.print("Enter third number: ");
		double c = in.nextDouble();
		
		System.out.print("Average is " + average(a, b, c) + "\n");
	}	
	public static double average(double a, double b, double c) {
		return (a + b + c) / 3;
	}

	

}
