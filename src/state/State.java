package state;

public interface State {
	
	//all methods which leads to change in state
	
	void login(StateM sm);
	void logout(StateM sm);	
	
	void open(StateM sm);
	void close(StateM sm);
	
	void deposit(StateM sm);
	void withdraw(StateM sm);	
	
	void lock(StateM sm);
	void unlock(StateM sm);
	
	void belowMinBalance(StateM sm);	
	void aboveMinBalance(StateM sm);	
	
	void incorrectPin(StateM sm);	
	void correctPin(StateM sm);
	
	void suspend(StateM sm);	
	void active(StateM sm);
	
	void balance(StateM sm);
	
	
	

}
