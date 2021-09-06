package operators;

public class Unaryoperator {

	public static void main(String[] args) {
	
		int a =+5;
		int b = -8;
		boolean fl = !true;
		System.out.println(fl);
//		
		
		int c = 5;
		c++;
	//	System.out.println(c++);//5
	//	System.out.println(c);//6
//		System.out.println(++c);
//		
//		
//		int d = c++ + c++;
//		System.out.println(d);//11
//		System.out.println(c);//7
//		
		int e = 5;
//		++e;
//		System.out.println(e);//6
//		System.out.println(++e);//7
//		 
//		int f = ++e + e++;
//		System.out.println(f);//12
//		System.out.println(e);//7
//		
		
		int f = --e + e--;
		//System.out.println(f);
		//System.out.println(e);
		
		int str = 5;
		
		
		
		int h = str-- + --str;
		
		System.out.println(h);
		

	}

}
