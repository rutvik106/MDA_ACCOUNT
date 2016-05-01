package state;

public class S0_Start extends State {

	@Override
	void create(StateM sm) {
		sm.setCurrentState(this);
		
	}

	@Override
	void open(StateM sm) {
		// TODO Auto-generated method stub
	}

}
