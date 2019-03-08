import java.util.Scanner;

public class Lab5_3 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students?: ");
		
		int students = input.nextInt();
		  
		String[] studentList = new String[students];
		double[] scores = new double[students];
		
		for( int i = 0; i < students; i++ ) 
		{
			System.out.println("Student name: ");
			studentList[i] = input.next();
			System.out.println("Student score: ");
			scores[i] = input.nextDouble();
		}
		
		sortingHat(scores, studentList, students);
		for( int i = 0; i < students; i++ ) 
		{
			System.out.println(studentList[i] + " " + scores[i]);
			
		}
	}
	
	public static void sortingHat(double[] scores, String[] names, int n) 
	{
		double temp; String tempS;
		boolean swapped;
		for(int i = 0; i < n - 1; i++) {
			swapped = false;
			for(int j = 0; j < n - i - 1; j++) {
				if(scores[j] > scores[j+1]){
					temp = scores[j];
					tempS=names[j];
					scores[j] = scores[j+1];
					names[j] = names[j+1];
					names[j+1] = tempS;
					scores[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
	}

}
