package datastore;

public class DS {
	
	public DS() {
		System.out.println("INITIALIZING DATA STORE");
	}

	int iuid=1234;
	String suid="1234";
	
	
	//TEMP VARIABLES
	int itmpPIN;
	public int getItmpPIN() {
		return itmpPIN;
	}
	public void setItmpPIN(int itmpPIN) {
		this.itmpPIN = itmpPIN;
	}
	public String getStmpPIN() {
		return stmpPIN;
	}
	public void setStmpPIN(String stmpPIN) {
		this.stmpPIN = stmpPIN;
	}
	public int getItmpDAmount() {
		return itmpDAmount;
	}
	public void setItmpDAmount(int itmpDAmount) {
		this.itmpDAmount = itmpDAmount;
	}
	public int getItmpWAmount() {
		return itmpWAmount;
	}
	public void setItmpWAmount(int itmpWAmount) {
		this.itmpWAmount = itmpWAmount;
	}
	public float getFtmpDAmount() {
		return ftmpDAmount;
	}
	public void setFtmpDAmount(float ftmpDAmount) {
		this.ftmpDAmount = ftmpDAmount;
	}
	public float getFtmpWAmount() {
		return ftmpWAmount;
	}
	public void setFtmpWAmount(float ftmpWAmount) {
		this.ftmpWAmount = ftmpWAmount;
	}
	String stmpPIN;
	
	int itmpDAmount,itmpWAmount;
	float ftmpDAmount,ftmpWAmount;
	
	
	//PARMANANT VARIABLES
	
	int ipin=1234;
	String spin="1234";
	
	int ibalance=5000;
	
	public int getIuid() {
		return iuid;
	}
	public void setIuid(int iuid) {
		this.iuid = iuid;
	}
	public String getSuid() {
		return suid;
	}
	public void setSuid(String suid) {
		this.suid = suid;
	}
	public void setIpin(int ipin) {
		this.ipin = ipin;
	}
	public void setSpin(String spin) {
		this.spin = spin;
	}
	public int getIbalance() {
		return ibalance;
	}
	public void setIbalance(int ibalance) {
		this.ibalance = ibalance;
	}
	public float getFbalance() {
		return fbalance;
	}
	public void setFbalance(float fbalance) {
		this.fbalance = fbalance;
	}
	public int getIpin() {
		return ipin;
	}
	public String getSpin() {
		return spin;
	}
	public int getIpenalty() {
		return ipenalty;
	}
	public float getFpenalty() {
		return fpenalty;
	}
	public int getIminBalance() {
		return iminBalance;
	}
	public float getFminBalance() {
		return fminBalance;
	}
	float fbalance=5000.0f;
	
	int ipenalty=10;
	float fpenalty=10.0f;
	
	int iminBalance=1000;
	float fminBalance=1000.0f;
	
	
}
