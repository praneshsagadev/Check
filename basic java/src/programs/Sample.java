package programs;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =1214;
		int rev =0;
		int rem;
		int temp=num;
		
		while(temp>0) {
			rem = temp%10;
			rev = rev*10+ rem;
			temp = temp/10;
			
			
			}
		if(num==rev) {
			System.out.println(num + " is a palindrome number");
			}
			else {
				System.out.println(num + " is not a palindrome number");
			}
			
		}
		
	}


