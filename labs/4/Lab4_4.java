import java.util.Scanner;

public class Lab4_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string of text: ");
		String userTxt = input.nextLine();
		
		char[] chars = new char[26];
		int[] count = new int[26];
		
		String S = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < chars.length; i++) {
			chars[i] = S.charAt(i);
		}
		for (int i = 0; i < userTxt.length(); i++) {
			for (int j = 0; j <chars.length; j++) {
				if (userTxt.charAt(i) == chars[j]) {
					count[j]++;
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println("The count of " + chars[i] + " is " + count[i]);
			}
		}

	}

}
