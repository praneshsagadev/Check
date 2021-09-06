package abstractClassTest;



public abstract  class RBI {

	public abstract void credit();
	public abstract void debit();
//	public abstract static  void deposit();
	public static void fixedDeposit() {
		
		System.out.println("Fixed Deposit");
	}
	public void loan() {
		
		System.out.println("Loan Method");
		
		
	}
	
}
