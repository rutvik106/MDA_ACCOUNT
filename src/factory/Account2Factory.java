package factory;
import account.Account1;
import account.Account2;

public class Account2Factory extends AbstractFactory {

	@Override
	public Account1 getAccount1() {
		return null;
	}

	@Override
	public Account2 getAccount2() {
		System.out.println("Inside getAccount2");
		return new Account2();
	}

}
