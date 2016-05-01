package state;

public abstract class State {
	
	//all methods which leads to change in state
	
	abstract void create(StateM sm);
	
	abstract void open(StateM sm);
	
	

}
