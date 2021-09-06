package singleton;

public class SingletonTest {

	static SingletonTest ref;

	private SingletonTest() {

	}

	public static SingletonTest singleTonObj() {

		if (ref == null) {

			ref = new SingletonTest();
		}
		
		return ref;

	}

}
