package overloadTest;

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		OverloadTest over = new OverloadTest();
over.overLoad(5);
over.overLoad(7, 8);
	}
	public void overLoad(int a) {
		int m =15;
		int c=a+m;
		System.out.println(c);
	}
public void overLoad(int a,int b) {
	System.out.println("Multiplication" + (a*b));
}
}
