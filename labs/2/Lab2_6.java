import java.util.Random;

public class Lab2_6 {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		num1 = generator.nextInt(500) + 100;
		num2 = generator.nextInt(541) + 100;
		num3 = generator.nextInt(8999) + 1000;
		
		System.out.println("Random Phone Number: " + "(" + num1 + ")" + num2 + "-" + num3);

	}

}
