import java.util.Scanner;

public class Lab3_1 {

	public static void main(String[] args) {
		//Scanner 
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("Enter numbers: ");
		int n = input.nextInt();
		double[] numbers = new double[n];
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];			
		}
		
		double average = (int) sum / n;
		
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0)
				count++;
		}
		
		System.out.println("Average is " + average);
		System.out.println("Number of even numbers: " + count);
		System.out.println("Sum is " + sum);
	}
}
