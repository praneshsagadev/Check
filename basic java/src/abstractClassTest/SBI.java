package abstractClassTest;

public class SBI extends RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI rbi =new SBI();
		rbi.loan();
		rbi.credit();
//		rbi.fixedDeposit();
		RBI.fixedDeposit();
		SBI sbi = new SBI();
		sbi.debit();
		sbi.credit();
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Credit Method");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Debit Method");
		credit();
		
	}

}
