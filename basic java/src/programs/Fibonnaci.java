package programs;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		int a=0;
		int b =1;
		System.out.print(a);
		System.out.print(" "+b);
		for(int i=0;i<=6;i++) {
			result=a+b;
		a=b;
		b=result;
		if(result<=8) {
			
			System.out.print(" "+result);	
		}
		
		}
		
		

	}

}
