import java.util.*;

public class AscendingOrder {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter five numbers: ");
		

        for (int i = 0; i < 5; i++) list.add(input.nextInt());
        
        sort(list);
        
        System.out.println("Sorted: ");
        
        System.out.println(list);
	}
	
	 public static void sort(ArrayList<Integer> list) {

	        list.sort(null);
	        
	 }
}
