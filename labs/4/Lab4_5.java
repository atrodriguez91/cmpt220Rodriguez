
public class Lab4_5 {

	public static void main(String[] args) {
		int[] nums = new int [1000];
		int high = 0;
		int low = 0;
		int sum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			nums [i] = (int)(Math.random() * 100);
			sum += nums[i];
		}
		
		double average = sum / 1000;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > average) {
				high++;
			}
			else if (nums[i] < average) {
				low++;
			}
		}
		System.out.println( high + " numbers above.");
		System.out.println( low + " numbers below.");
		System.out.println( "Average is: " + average);

	}

}
