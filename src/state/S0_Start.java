package state;

public class S0_Start implements State {

	public S0_Start() {
		System.out.println("INSIDE START STATE");
	}
	
	@Override
	public void login(StateM sm) {
		System.out.println("INVALID STATE YOU MUST OPEN ACCOUNT FIRST");
	}

	@Override
	public void open(StateM sm) {
		sm.setCurrentState(new S3_Ready());		
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
