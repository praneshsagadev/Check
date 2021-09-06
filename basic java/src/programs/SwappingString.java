package programs;

public class SwappingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String m   = "Vcentry";
		String abc = "Selenium";
		System.out.println("Before swapping values of m and abc are :" );
		
		System.out.println(m);
		System.out.println(abc);
		
		String t =m;
		m=abc;
		abc=t;
		
		System.out.println("After swapping values of m and abc are :");
		
		System.out.println(m);
		System.out.println(abc);
		
	}

}
