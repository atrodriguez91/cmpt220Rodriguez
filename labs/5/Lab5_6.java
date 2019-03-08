import java.util.Scanner;

public class Lab5_6 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Grid size: ");
		
		int n = input.nextInt();
		
		int[][] grid = new int[n][n];
		
		for (int a = 0; a < n; a++) 
		{
			for (int b = 0; b < n; b++) 
			{
				System.out.print("Enter #: ");
				grid[a][b] = input.nextInt();
			}
		}
		int col = n;
		while (col >= n) {
			System.out.print("Enter column that results one from above: ");
			col = input.nextInt();
		}
		int col2 = col - 1;
		float average = 0;
		for (int i = 0; i < n; i++) 
		{
			average += grid[i][col2];
		}
		average = average / n;
		
		System.out.println("Column average " + col + ": " + average);
		
		printGrid(grid, n);

	}

	public static void printGrid(int[][] grid, int n) 
	{
		for ( int rows = 0; rows < n; rows++ ) 
		{
			for ( int cols = 0; cols < n; cols++ )
			{
				System.out.print(grid[rows][cols] + " ");
			}
			
			System.out.println();

		}
	}

}
