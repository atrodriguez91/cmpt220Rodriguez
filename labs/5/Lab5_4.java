import java.util.Scanner;
public class Lab5_4 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("First list length: ");
		int[] listOne = new int[input.nextInt()];
		System.out.println("First list #'s: ");
		
		for (int i = 0; i < listOne.length; i++) 
		{
			listOne[i] = input.nextInt(); 
		}
			
		System.out.print("Second list length: ");
		
		int[] listTwo = new int[input.nextInt()];
		System.out.print("Enter list 2: ");
		
		for (int i = 0; i < listTwo.length; i++)
			listTwo[i] = input.nextInt();

		
		System.out.println("Lists are" + (equals(listOne, listTwo) ? " " : " not ") 
			+ "identical");
	}
	
	
	public static boolean equals(int[] listOne, int[] listTwo)
	{
		if ( listOne.length != listOne.length )
			return false;

		for ( int i = 0; i < listOne.length; i++ ) 
		{
			if ( listOne[i] != listTwo[i] ) // JA: The elements could be in different order
				return false;
		}
		return true;
	}

}


