package account;

import datastore.DS;
import factory.AbstractFactory;
import factory.Account1Factory;
import factory.FactoryProducer;
import state.MDA_EFSM;

public class Account1 {
	
	Account1Factory factory;
	
	DS ds;
	
	MDA_EFSM m;
	
	public Account1() {
		System.out.println("Initializing Account1");
		AbstractFactory factory=FactoryProducer.getFactory("ACCOUNT1FACTORY");
		this.factory=factory.getAccount1Factory();		
		m=new MDA_EFSM(factory);	
		this.ds=factory.getAccount1Factory().getDataStore();
	}
	
	public void Open(String p, String y, float a){
		System.out.println("OPENNING ACCOUNT");
		ds.setSpin(p);
		ds.setSuid(y);
		ds.setFbalance(a);
		m.open();
	}
	
	public void withdraw(float w){
		System.out.println("withdrawing from account1");
		ds.setFtmpWAmount(w);
		if(ds.getFbalance()-w>0){
			m.withdraw();
		}
		if(ds.getFbalance()<ds.getFminBalance()){
			
		}
		
	}
	
	
	
	
	
}
