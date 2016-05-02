package state;

import factory.AbstractFactory;
import operations.OP;

public class StateM {
	
	OP op;
	
	State currentState;
	
	
	public StateM(AbstractFactory factory) {
		System.out.println("CREATED STATE MACHINE");
		op=new OP(factory);
		currentState=new S0_Start();
	}
	
	public void setCurrentState(State s){
		currentState=s;
	}

	public void open(){
		currentState.open(this);
	}
	
	public void login(){
		currentState.login(this);
	}
	
	public void withdraw(){
		currentState.withdraw(this);
	}
	
}
