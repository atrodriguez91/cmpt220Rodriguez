
interface Printable {
	public void print();
}

class Rectangle implements Printable {
	private int length, width;
	
	public Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public void print() {
		System.out.println("Rectangle : length: " + length + "width: " + width + "Area: " + length*width);
	}
}
class SportCar implements Printable {
	private String name;
	private long number;
	
	public SportCar (String name, long number) {
		this.name = name;
		this.number= number;
	}
	
	@Override
	public void print() {
		System.out.println("SPorts Car: Name: " + name + "Number: " + number);
	}
}



public class PrintableDemo {
	public static void main (String args[]) {
		Printable vec[] = {
				new Rectangle(200,100),
				new SportCar("Fiat", 7892321),
				new Rectangle(34,32),
				new Manager("Claire", 32),
				new Rectangle(54,10),
				new SportCar("Audi", 4322344),
				new SportCar("Mazda", 4322343),
				new Manager("John", 2344322)
		};
		
		for (int index = 0; index < vec.length; index ++) {
			vec[index].print();
		}
	}
}
