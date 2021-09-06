package interfaceTest;

public interface RBI {
	public void credit();
	
	public void debit();
	
	public static void loan() {
		
		System.out.println("Loan Method");
	}
	
	default void defaultMethod() {
		System.out.println("Default Method");//its not mandatory to define all methods
		
	}
	
	

}
