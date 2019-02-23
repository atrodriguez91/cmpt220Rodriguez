
public class Lab3_3 {

	public static void main(String[] args) {
		int i;
		int perLine = 20;
		int count = 0;
		
		for (i = 1; i <= 100; i++) {
			if (i <= 100 ) {
				count ++;
				if (count % perLine == 0)
					System.out.println((char)i);
				else
					System.out.print((char)i + " ");
			}
			
		}

	}

}
