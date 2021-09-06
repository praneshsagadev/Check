package javaprograms;

public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1214;
		int temp=num;
		int rev=0;
		int rem;
		while(temp!=0) {
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		
		if(num==rev) {
			
			System.out.println(num+ " is palindrome number");
		}
		
		else {
			System.out.println(num+ " is not palindrome number ");
		}
	}

}
