package programs;

public class SwappingString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "selenium";
		String b = "World";
		
		System.out.println("Before Swapping the value of a and b are : ");
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
		
		a = a+b;
		b = a.substring(0,(a.length()-b.length()));
		a = a.substring(b.length());
		
		System.out.println("After Swapping the values of a and b are : ");
		
System.out.println("The value of a is " + a);
System.out.println("The value of b is " + b);
		
		

	}

}
