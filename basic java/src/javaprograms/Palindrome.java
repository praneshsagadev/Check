package javaprograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aabaa";
		int len = s1.length();
		String s2;
		String s3 ="";
		for(int i=len;i>0;i--) {
//			
//			String s2 =(String)s1.charAt(i-1);
//			s2+s1.charAt(i-1);
			 s2 = String.valueOf(s1.charAt(i-1));
			 
			  s3 = s3.concat(s2);
//			System.out.println(s2+"char");
//			  System.out.print(s3);
		}
		System.out.println(s3);
		
		if(s1.equals(s3)) {
			
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
