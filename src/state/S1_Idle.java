package state;

public class S1_Idle implements State {

	@Override
	public void login(StateM sm) {
		// TODO Auto-generated method stub
		System.out.println("LOGING IN");
	}

	@Override
	public void open(StateM sm) {
		// TODO Auto-generated method stub
		System.out.println("INVALID STATE ACCOUTN ALREADY OPEN PLEASE LOGIN");
	}

	@Override
	public void withdraw(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lock(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unlock(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void belowMinBalance(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aboveMinBalance(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incorrectPin(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correctPin(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suspend(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void active(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance(StateM sm) {
		// TODO Auto-generated method stub
		
	}

}
