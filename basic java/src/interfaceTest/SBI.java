package interfaceTest;

public class SBI implements RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int interest =100;
		int amount =10000;
	SBI ef = new SBI();	
	ef.credit(interest,amount);
	ef.debit();

	}
	public void credit(int interest,int amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit Method of SBI"+( interest+amount));
	}
public void credit() {
	
}
	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Debit Method of SBI");
		
	}

}
