package state;

public class S3_Ready implements State {

	public S3_Ready() {
		System.out.println("INSIDE READY STATE");
	}

	@Override
	public void login(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout(StateM sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open(StateM sm) {
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
	public void withdraw(StateM sm) {
		
		sm.op.withdraw();
		
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
