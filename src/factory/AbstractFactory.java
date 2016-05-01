package factory;
import account.Account1;
import account.Account2;

public abstract class AbstractFactory {
	
	public abstract Account1 getAccount1();
	
	public abstract Account2 getAccount2();

}
