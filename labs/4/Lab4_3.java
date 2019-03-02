import java.util.Scanner;

public class Lab4_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String userString = input.nextLine();
		String reverse = reverse(userString);
		System.out.println(reverse);
		boolean palin = isPalindrome(userString);
		System.out.println(palin);

	}
		public static String reverse(String s) {
			String result = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				result += s.charAt(i);
			}
			return result;
		}
		public static boolean isPalindrome(String s) {
			boolean isPalin = false;
			if (s.contentEquals(reverse(s))) {
				isPalin = true;
			}
			return isPalin;
		}

}
