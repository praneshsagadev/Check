package stringtest;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=123;
		String str2="";
		 String str = String.valueOf(a);
		 for(int i=str.length()-1;i>=0;i--) {
			 str2 =str2+str.charAt(i);
		
		 }
		 System.out.println("string :" +str2);
		 
		 int b = Integer.valueOf(str2);
		 System.out.println("int :"+ b);
	}

}
