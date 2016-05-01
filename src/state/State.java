package state;

public interface State {
	
	//all methods which leads to change in state
	
	void create(StateM sm);
	
	void open(StateM sm);
	
	

}
