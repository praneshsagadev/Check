package datatypeTest2;

import java.util.Scanner;

import inheritanceTest.Vehicle;

public class ScannerTest extends Vehicle{

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value");
//		String abc = sc.next();
//		System.out.println("Entered value "+ abc);
//		System.out.println("Value from args "+ args[0]);
//		
//		//Vehicle vehicle = new Vehicle();
//		ScannerTest vehicle = new ScannerTest();
//		vehicle.runs();
		
	@SuppressWarnings("resource")
	Scanner scc= 	new Scanner(System.in);
	
	System.out.println("Enter the value :");
	
	String str = scc.next();
	
	System.out.println("Value :" + str);
	
		
	}

}
