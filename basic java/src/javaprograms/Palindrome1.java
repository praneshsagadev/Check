package javaprograms;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "aabaaa";
		int len = s1.length();
		String s2="";
		for(int i=len;i>0;i--) {
			
			
		s2=	s2+s1.charAt(i-1);
			
			 
			
		
//			  System.out.print(s3);
		}
		
		
		if(s1.equals(s2)) {
			
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}

}
