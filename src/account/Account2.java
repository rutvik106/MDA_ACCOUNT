package account;

public class Account2 implements Account {
	
	public Account2() {
		System.out.println("Initializing Account2");
	}

	@Override
	public float balance() {
		System.out.println("Called Balance On Account2");
		return 0;
	}

	@Override
	public void logout() {
		System.out.println("Called Logout On Account2");		
	}

}
