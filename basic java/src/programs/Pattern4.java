package programs;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ab =new Scanner(System.in);
		System.out.println("Enter the number");
		int num = ab.nextInt();
		
		for(int i=0;i<num;i++) {
			
			for (int j=num-1;j>i;j--) {
				
				System.out.print(" ");
			}
			
			for(int k=0;k<=i*2;k++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
	}

}
