public class Lab3_2 {
	
	public static void main(String[] args) {
		
		int amountLines = 10;
		int count = 0;
		
		for (int i = 100; i <= 1000; i++) {
			if (i % 5 == 0 ^ i % 7 == 0) { // JA
				count++;
				if (count % amountLines == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");
			}
		}
		
	}

}
