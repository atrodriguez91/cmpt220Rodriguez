
public class Lab3_7 {

	public static void main(String[] args) {
		
		int count = 1;
		
		for(int i = 1; i <= 50; i++) {
			System.out.printf("%-6d", pentagonNumbers(i));
			if(count % 10 == 0) System.out.println();
			count++;
		}

	}
	public static int pentagonNumbers(int i) {
		return (i * (3 * i - 1)) / 2;
	}
}
