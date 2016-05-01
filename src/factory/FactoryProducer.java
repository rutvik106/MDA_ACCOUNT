package factory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice){
		System.out.println("Inside getFactory");
		if(choice.equalsIgnoreCase("ACCOUNT1FACTORY")){
			return new Account1Factory();
		}
		else if(choice.equalsIgnoreCase("ACCOUNT2FACTORY")){
			return new Account2Factory();
		}
		
		return null;
		
	}

}
