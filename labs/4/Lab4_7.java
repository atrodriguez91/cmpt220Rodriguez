import java.util.Scanner;

public class Lab4_7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter twenty numbers: ");
		
		int userNum = input.nextInt();
		int[] userArray = new int [20];
		userArray[0] = userNum; 
		
		for (int i = 1; i < 20 && userNum != 0; i++) {
			for (int j = 0; j < i; j++) {
				if (userArray[j] == userNum) {
					userArray [i] = 0;
					i--;
				}
				else {
					userArray[i] = userNum;
				}
			}
			userNum = input.nextInt();
			
		}
		for (int j = 0; j < userArray.length; j++) {
			if (userArray[j] != 0)
				System.out.print(userArray[j] + " ");
		}

	}

}
