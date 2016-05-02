package state;

import account.Account;
import factory.AbstractFactory;
import operations.OP;

public class StateM {
	
	OP op;
	
	State currentState;
	
	
	public StateM(AbstractFactory factory) {
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
	
}
