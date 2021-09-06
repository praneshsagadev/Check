package variableTypes;

public class Classlevelvariable {
	
	static int  g = 5;
int h = 9;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println(a);
		System.out.println(g);
		System.out.println(Classlevelvariable.g);
		Classlevelvariable ref = new Classlevelvariable();
		
		System.out.println(ref.h);
		
		ref.method1();
	}
	
	public  void method1() {
		System.out.println("method "+ g);
		
		Classlevelvariable ghi = new Classlevelvariable();
		System.out.println("method1 " + ghi.h);
		
		
	}

}
