import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		
		System.out.println("Enter a + integer: ");
		int number = i.nextInt();
		
		System.out.print("Smallest factors of " + number + " are: ");
		StackOfIntegers stack = new StackOfIntegers();
		
		smallFactors(number, stack);
		
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		
		System.out.println();

	}
	
	public static void smallFactors (int number, StackOfIntegers stack) {
		int i = 2;
		while (number / i != 1) {
			if (number % 1 == 0 ) {
				stack.push(i);
				number /= i;
			}
			else
			
				i++;
		}
		stack.push(number);
	}

}
