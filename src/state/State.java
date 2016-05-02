package state;

public interface State {
	
	//all methods which leads to change in state
	
	void login(StateM sm);
	
	void open(StateM sm);
	
	

}
