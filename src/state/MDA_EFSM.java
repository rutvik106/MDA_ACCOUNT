package state;

import factory.AbstractFactory;

public class MDA_EFSM {
	
	StateM sm;
	
	public MDA_EFSM(AbstractFactory factory) {
		System.out.println("MDA_EFSM CREATED");
		sm=new StateM(factory);
	}
	
	public void open(){
		sm.open();
	}
	
	public void login(){
		sm.login();
	}
	
	public void withdraw(){
		sm.withdraw();
	}
	
	public void belowMinBalance(){
		
	}
	

}
