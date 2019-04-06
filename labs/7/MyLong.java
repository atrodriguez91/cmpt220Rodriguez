
public class MyLong {
	long value;
	
	MyLong(long number) {
		value = number;
	}
	
	public long getValue() {
		return value;
	}
	
	public static boolean isEven(long n) {
		return (n % 2 ==0);
	}
	
	public static boolean isOdd(long n) {
		return !isEven(n);
	}
	
	public static boolean isPrime(long n) {
		for (long p = 2; p < n / 2; p++) {
			if (n % p == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven (MyLong n) {
		return n.isEven(n);
	}
	
	public static boolean isOdd (MyLong n) {
		return n.isOdd(n);
	}
	
	public static boolean isPrime (MyLong n) {
		return n.isPrime(n);
	}
	
	public boolean isEven() {
		return isEven(value);
	}
	
	public boolean isOdd() {
		return isOdd(value);
	}
	
	public boolean isPrime() {
		return isPrime(value);
	}
	
	public boolean equals(long n) {
		return (value == n);
	}
	
	public boolean equals (MyLong n) {
		return equals(n.getValue());
	}
	
	public static long parseLong (String s) {
		return Long.parseLong(s);
	}
	
	public static long parseLong (char[] s) {
		return parseLong (new String(s));
	}

}
