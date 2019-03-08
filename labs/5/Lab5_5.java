import java.util.Scanner;

public class Lab5_5 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
// This is Neo... jacking in. 
		System.out.print("Matrix size: ");
		
		int t = input.nextInt();
		
		int[][] neoMatrix = new int[t][t];
		for (int r = 0; r < t; r++) 
		{
			for (int c = 0; c < t; c++) 
			{
				System.out.print("Enter #: ");
				neoMatrix[r][c] = input.nextInt();
			}
		}
		
		printMatrix(neoMatrix, t);
		
		System.out.println();
		
		printTransposeMatrix(neoMatrix, t);
		
	}

	public static void printMatrix(int[][] matrix, int n) 
	{
		for (int rows = 0; rows < n; rows++) 
		{
			for (int cols = 0; cols < n; cols++) 
			{
				System.out.print(matrix[rows][cols] + " ");
				
			}
			System.out.println();

		}
	}
	public static void printTransposeMatrix(int[][] matrix, int n) 
	{
		for (int rows = 0; rows < n; rows++) 
		{
			for (int cols = 0; cols < n; cols++) 
			{
				System.out.print(matrix[cols][rows] + " ");
				
			}
			System.out.println();

		}
	}
}
