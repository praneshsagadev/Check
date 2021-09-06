package overloadTest;

public class OverloadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadTest1 ov = new OverloadTest1();
		ov.overLoad(10,5);
		ov.overLoad("vcentry", 5);
		

	}
	public void overLoad(int a,int b) {
		int m =15;
		int c=a+m;
		System.out.println(c);
	}
public void overLoad(String m,int n) {
	System.out.println("concat "+ m + n);
}
}
