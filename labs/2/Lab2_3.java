import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		
		System.out.print("Enter a min and max: ");
		
		Scanner input = new Scanner(System.in);
		
		int min = input.nextInt();
		int max = input.nextInt();
		
		System.out.println(min + (int)(Math.random() * (max - min)));
		System.out.println(min + (int)(Math.random() * (max - min)));
		System.out.println(min + (int)(Math.random() * (max - min)));
		

	}

}
