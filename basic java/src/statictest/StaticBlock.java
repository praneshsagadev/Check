package statictest;

public class StaticBlock {
//	static StaticBlock sb;
	static {
		System.out.println("vcentry");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
		StaticBlock sb = new StaticBlock();
		
		sb.nonStaticmethod();
		StaticBlock.staticMethod();
	}
public void nonStaticmethod() {
	StaticBlock.staticMethod();
	StaticBlock sb1=new StaticBlock();
			sb1.nonStaticmethod();
}
public static void staticMethod() {
	
} 
}
