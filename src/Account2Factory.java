
public class Account2Factory extends AbstractFactory {

	@Override
	Account1 getAccount1() {
		return null;
	}

	@Override
	Account2 getAccount2() {
		System.out.println("Inside getAccount2");
		return new Account2();
	}

}
