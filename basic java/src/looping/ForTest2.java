package looping;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;	
		for(int i =1;i<=a;i++) {
			
			for(int j=1;j<=5;j++) {
				
				System.out.println("J for loop: " +j+" i value  "+i);
			}
			
			System.out.println("Line number: " +i);
			
		}	
	}

}
