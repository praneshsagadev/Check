package conditionalstatements;

public class Greatestnumber {

	public static void main(String[] args) {
		
		
		int a = 25;
		int b = 30;
		int c = 20;
		
		if(a>=b&&a>=c) {
			
			System.out.println("a is the greatest number");
		}
		
		else if(b>=c) {
			
			System.out.println("b is the greatest number");
		}
		
		else {
			System.out.println("c is the greatest number");
		}
		
	}
	
}
