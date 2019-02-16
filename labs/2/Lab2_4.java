
import java.io.Reader;
import java.util.Scanner;

public class Lab2_4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter first character: ");
		char first = reader.next().charAt(0);
		int number = first;
		
		System.out.print("Enter second character: ");
		
		char second = reader.next().charAt(0);
		int numberTwo = second;
		
		System.out.print(number + numberTwo);
		
	}

}
