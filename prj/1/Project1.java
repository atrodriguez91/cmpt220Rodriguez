import java.util.Scanner;

public class Project1 {
	
	public Scanner read;
	
	public static void main(String[] args) {
		Project1 run = new Project1();
		run.brickWall();
	}
	
	private void brickWall() {
		read = new Scanner(System.in);
		double wallHeight = read.nextDouble();
		int wallWidth = read.nextInt();
		int bricks = read.nextInt();
		int[] amountBricks = new int[bricks];
		
		for (int i = 0; i < bricks; i++) 
		{
			amountBricks[i] = read.nextInt();
		}
		
		int countWidth = wallWidth;
		for (int i = 0; i < amountBricks.length; i++) {
			countWidth -= amountBricks[i];
			
			if (countWidth == 0) {
				countWidth = wallWidth;
				wallHeight--;
				if (wallHeight == 0) {
					System.out.println("Yes");
					return;
					
				}
			}
			else if (countWidth < 0) {
				System.out.println("No");
				return;
			}
		}
	}
}
