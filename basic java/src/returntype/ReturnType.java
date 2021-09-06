package returntype;

public class ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
   int s= add();
      System.out.println(s);
	}
	public static int add() {
		
		int a =5,b=10,c;
		 c =a+b;
		 
		 String s2 =abc("vcentry");
		System.out.println(s2);
		return c;
		
	}
	public static String abc(String str) {
		int a =5;
		String s1 ="selenium"+str;
		return s1+a;
		
	}

}
