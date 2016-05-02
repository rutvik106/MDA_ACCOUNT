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

}
