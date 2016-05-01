package state;

public class S0_Start implements State {

	@Override
	public void create(StateM sm) {
		sm.setCurrentState(new S1_Idle());		
	}

	@Override
	public void open(StateM sm) {
		System.out.println("NOT VALID STATE FOR OPERATION TO TAKE PLACE");
	}

}
