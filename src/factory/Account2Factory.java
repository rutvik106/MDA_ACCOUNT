package factory;
import account.Account1;
import account.Account2;
import datastore.DS;
import strategies.A2_1;

public class Account2Factory extends AbstractFactory {

	@Override
	public Account1Factory getAccount1Factory() {
		return null;
	}

	DS ds;

	public Account2Factory() {
		System.out.println("Inside getAccount1");
		ds=new DS();
	}

	public DS getDataStore(){
		return ds;
	}

	public A2_1 getA2(){
		return new A2_1(ds);
	}

	@Override
	public Account2Factory getAccount2Factory() {
		return new Account2Factory();
	}


}
