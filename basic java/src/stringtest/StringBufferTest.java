package stringtest;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vcentry";
		
//		String string = new String("selenium");
		String s=str.concat(" technology");
		System.out.println(s+" stringclass ");
		
		
		StringBuffer sb = new StringBuffer("automation");

	sb.append(" selenium");
	System.out.println(sb + " StringBuffer");
	
	sb.insert(10, false);
	System.out.println(sb);
	
	sb.delete(10,15);
	System.out.println(sb);
	
	String str1 =sb.substring(0,10);
	System.out.println(str1 + " substring");
	
	sb.replace(0, 10, "Test");
	System.out.println(sb + " Replace");
	
	
	
	sb.reverse();
	System.out.println(sb + " reverse");
	
	StringBuilder g = new StringBuilder("CHENNAI");
//	int a = 15,b=10;
	}

}
