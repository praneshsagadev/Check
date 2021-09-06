package overriding;

public class OverRideChildClass extends OverRideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//OverRideChildClass.override(5);
OverRideTest ab =new OverRideChildClass();
ab.override(5);
	}
	public   void override(int a) {
		super.override(a);
		System.out.println("child class" + a);
		OverRideChildClass.main(10);
	}
public static void main (int b) {
	
	System.out.println("Overloaded main method");
}


}
