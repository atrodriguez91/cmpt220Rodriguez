
public class Checking extends Account {
	
	int overdraft = 1000;
	
	// JA: withdraw method?
	public String toString() {
		return "Checking Account " + "overdraft limit " + overdraft;
	}

}
