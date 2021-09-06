package conditionalstatements;

public class Nestedif {

	public static void main(String[] args) {
		
		int a =8;
		int b =10;
		
		
		if(a<b) {
			
			if(a<b) {
				
				System.out.println("a<b");
			}
			else {
				
				System.out.println("else statement of a<b");
				System.out.println("a>b");
			}
			
			}
		
		else {
			System.out.println("else 1 statement of a<b");
			
		}
		

	}

}
