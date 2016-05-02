package strategies;

import datastore.DS;

public class A2_1 implements A2{
	
	DS ds;
	
	public A2_1(DS ds) {
		this.ds=ds;
	}

	@Override
	public void withdrawal() {
		ds.setFbalance(ds.getFbalance()-ds.getFtmpWAmount());
		System.out.println("WITHDRAW SUCCESSFUL");
	}

	
	
}
