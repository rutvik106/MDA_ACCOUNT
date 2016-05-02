package factory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice){
		
		if(choice.equalsIgnoreCase("ACCOUNT1FACTORY")){
			System.out.println("Getting new Account1 factory");
			return new Account1Factory();
		}
		else if(choice.equalsIgnoreCase("ACCOUNT2FACTORY")){
			System.out.println("Getting new Account2 factory");
			return new Account2Factory();
		}
		
		return null;
		
	}

}
