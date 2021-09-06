package inheritanceTest;

public class Bike extends Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike cd = new Bike();
		int ef = cd.seatCounts;

		cd.stop();
		cd.speed(100);

		cd.runs();
		Vehicle.stop();

	}

	public void speed(int sp) {

		System.out.println("Speed of the bike is " + sp);
	}

}
