import java.util.Scanner;

public class Lab5_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter ten numbers: ");
		
		double[] tenArray = new double[11];
		
		for (int i = 0; i < 10; i++) 
		{
			double userNumber = input.nextDouble();
			tenArray[i] = userNumber;
		}
		
		double maxNumb = max(tenArray);
		System.out.println("Max number is " + maxNumb);
			
	}
	
	public static double max(double[] tenArray) 
	{
		double maxNumb = 0;
		for (int i = 0; i < tenArray.length; i++) 
		{
			if (tenArray[i] > maxNumb); 
			{
				maxNumb = tenArray[i];
			}
		}
		return maxNumb;
	}

}
