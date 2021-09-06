package javaprograms;

public class MissingNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 4, 5, 8, 9, 20 }; // 3 6 7

		for (int i = 0; i < a.length - 1; i++) {
			int b = a[i + 1] - a[i]; // 20-9=11
			if (b != 1) {
				for (int j = 1; j < b; j++) { // 1<11, 2<
					System.out.println(a[i] + j); // 2+1=3
				}
			}

		}

	}

}
