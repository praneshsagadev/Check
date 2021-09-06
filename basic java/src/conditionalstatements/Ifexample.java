package conditionalstatements;

public class Ifexample {

	public static void main(String[] args) {
		
		int mark = 35 ;
		
		if(mark>40) {
			
			if((mark>=80)&&(mark<=100)) {
				
				System.out.println("A Grade");
			}
			else if(mark>=60&&mark<80){
				
				System.out.println("B Grade");
				
			}
			else  {
				
				System.out.println("C Grade");
			}
		}
		
		else {
			if(mark>30 && mark<=40) {
				
				System.out.println("Retest");
			}
			
			else {
				
				System.out.println("Fail");
			}
			
		}
		
		

	}

}
