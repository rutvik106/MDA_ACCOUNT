package factory;
import account.Account1;
import account.Account2;
import datastore.DS;

public class Account1Factory extends AbstractFactory {
	
	@Override
	public Account2 getAccount2() {
		return null;
	}
	
	DS ds1;

	@Override
	public Account1 getAccount1() {
		System.out.println("Inside getAccount1");
		ds1=new DS();
		return new Account1();
	}
	
	public DS getDataStore(){
		return ds1;
	}

	void getA1(){
		
	}
	
	
	
	

}
