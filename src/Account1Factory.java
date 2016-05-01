
public class Account1Factory extends AbstractFactory {

	@Override
	Account1 getAccount1() {
		System.out.println("Inside getAccount1");
		return new Account1();
	}

	@Override
	Account2 getAccount2() {
		return null;
	}
	
	

}
