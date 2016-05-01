
public class TestRun {
	
	public static void main(String[] args) {
		
		AbstractFactory factory=FactoryProducer.getFactory("ACCOUNT1FACTORY");
		
		Account1 a1=factory.getAccount1();
		
		a1.balance();
		
		a1.logout();
		
		
	}

}
