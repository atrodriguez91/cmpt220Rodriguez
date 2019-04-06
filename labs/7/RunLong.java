import java.util.Scanner;

public class RunLong {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter #: ");
		
		long num = input.nextLong();
		
		MyLong l1 = new MyLong(num);
		
		System.out.println(num +" is even." + l1.isEven());
		System.out.println(num +" is odd." + l1.isOdd());
		System.out.println(num +" is Prime." + l1.isPrime());
		
		char[] a = {'1', '2', '3'};
		System.out.println("Characters " + MyLong.parseLong(a));
		
		String s = "123456789"; 
		
		System.out.println("String is " + MyLong.parseLong(s));
		System.out.println("11 is odd  " + MyLong.isOdd(11));
		System.out.println("2 is even " + MyLong.isEven(2   ));

	}

}
