package factory;
import account.Account1;
import account.Account2;

public abstract class AbstractFactory {
	
	public abstract Account1Factory getAccount1Factory();
	
	public abstract Account2Factory getAccount2Factory();

}
