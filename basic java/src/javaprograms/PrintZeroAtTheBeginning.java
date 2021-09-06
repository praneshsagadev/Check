package javaprograms;

public class PrintZeroAtTheBeginning {

	public static void main(String[] args) {

		int c[] = { 1,0, 4, 7, 6, 0, 0, 3 };

		int len = c.length;

		int count = len - 1;

		for (int i = len - 1; i >= 0; i--) {

			if (c[i] != 0) {

				c[count] = c[i];
				count--;

			}

		}
		// c[i]!=0--if 4,7,6,3
		
		
		while (count >= 0) {

			c[count] = 0;
			count--;
		}
//		{0,0,0,4,7,6,3}
System.out.print("{");
		for (int i = 0; i < len; i++) {

			System.out.print(c[i] );
			
			if(i<len-1)
			System.out.print( ",");
			
			
		}
		System.out.println("}");

	}

}
