package looping;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Vcentry";
		int len = s1.length();

////		for(int i =0;i<=len;i++) {
//			System.out.println(s1.charAt(i));
//		}
		
		for(int i=len;i>0;i--) {
			
			System.out.println(s1.charAt(i-1));
		}
	}

}
