package account;

public class Account1 implements Account {
	
	public Account1() {
		System.out.println("Initializing Account1");
	}

	@Override
	public float balance() {
		System.out.println("Called Balance On Account1");
		return 0;
	}

	@Override
	public void logout() {
		System.out.println("Called Logout On Account1");		
	}

	
	
}
