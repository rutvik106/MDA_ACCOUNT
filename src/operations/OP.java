package operations;

import factory.AbstractFactory;
import strategies.A2;

public class OP {
	
	AbstractFactory factory;
	
	A2 a2;
	
	public OP(AbstractFactory factory) {
		System.out.println("CREATED OPERATIONS");
		this.factory=factory;
		a2=factory.getAccount1Factory().getA2();
	}
	
	public void withdraw(){
		a2.withdrawal();
	}
	

}
