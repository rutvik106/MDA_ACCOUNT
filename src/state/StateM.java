package state;

import operations.OP;

public class StateM {
	
	OP op;
	
	State currentState;
	
	
	public StateM() {
		op=new OP();
		currentState=new S0_Start();
	}
	
	public void setCurrentState(State s){
		currentState=s;
	}

}
