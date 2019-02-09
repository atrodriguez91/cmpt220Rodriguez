// JA: Next time keep every problem in a separate class
public class Lab01 {

	public static void main(String[] args) {
		double answer1 = (15.4 * 6.5 - 4.3 * 3) / (46.3 - 3.5);
		System.out.println("The result of (15.4 * 6.5 - 4.3 * 3) / (46.3 - 3.5) is " 
		+ answer1);
		
		double Pi = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		double ModPi =  4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1/13));
		System.out.println("This is the result of Pi: " + Pi);
		System.out.println("This is the result of extra Pi: " + ModPi);

	}
}
