
public class Lab4_2 {

	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz" ;
		int random = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				random = (int) (Math.random() * 26);
				System.out.print(alphabet.charAt(random));
				
			}
			System.out.println();
		}

	}

}
