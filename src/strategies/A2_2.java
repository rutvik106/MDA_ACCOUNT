package strategies;

import datastore.DS;

public class A2_2 implements A2 {

	DS ds;

	public A2_2(DS ds) {
		this.ds=ds;
	}

	@Override
	public void withdrawal() {
		ds.setIbalance(ds.getIbalance()-ds.getItmpWAmount());
	}

}
