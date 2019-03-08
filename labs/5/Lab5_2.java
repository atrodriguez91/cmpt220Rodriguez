import java.util.Scanner;

public class Lab5_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ten #'s: ");
		
		double[] tenNum = new double[10];
		for( int i = 0; i < 10; i++ )
		{
			double currentNum = input.nextDouble();
			tenNum[i] = currentNum;
		}
		
		double mean = mean(tenNum);
		System.out.println("Mean is : " + mean);
		
		
		double deviation = deviation(tenNum);
		System.out.println("SD is : " + deviation);
		
		

	}
	public static double deviation(double[] x) 
	{
		
		double mean = mean(x);
		double total = 0;
		for( int i = 0; i < x.length; i++ ) 
		{
			total+= (x[i] - mean)*(x[i] - mean);
			
		}
		total = total/(x.length - 1);
		total = Math.sqrt(total);
		return total;
		
	}
	public static double mean(double[] x) 
	{
		double alpha = 0;
		
		for(int i = 0; i < x.length; i++) 
		{
			alpha += x[i];
		}
	
		double mean = alpha/x.length;	

		return mean;
	
		
	}
	
}
