import java.util.Scanner;

public class Lab2_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String firstS = input.nextLine();
		
		System.out.print("Enter second string: ");
		String secondS = input.nextLine();
		
		System.out.println(firstS.compareTo(secondS));

	}

}
