package interfaceTest;

public class HDFC implements RBI{

	public static void main(String[] args) {
	
		
		RBI.loan();
		
		HDFC ab = new HDFC();
		ab.defaultMethod();
		
		RBI cd =new HDFC();
		cd.credit();
		ab.credit();
		

	}

	
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Credit Method");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Debit Method");
		
	}

}
