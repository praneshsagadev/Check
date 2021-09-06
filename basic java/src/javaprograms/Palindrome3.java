package javaprograms;



public class Palindrome3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="aabaaa";
//		String str1=str;
		String rev="";
		int len=str.length();
		for(int i=len;i>0;i--) {
			rev=rev+str.charAt(i-1);
		}
		
		
	if(str.equals(rev)) {
		
		System.out.println(str +" is a palindrome ");
	}
	else {
		System.out.println(str+" is not a palindrome ");
	}	

	}

}
