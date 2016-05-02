package state;

public class S0_Start implements State {

	@Override
	public void login(StateM sm) {
		System.out.println("INVALID STATE YOU MUST OPEN ACCOUNT FIRST");
	}

	@Override
	public void open(StateM sm) {
		sm.setCurrentState(new S1_Idle());		
	}

}
