package javaprograms;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String st=" VcenTry ";
		
		System.out.println(st+ " String Text" );
		
		String sd="vcentry123";
		System.out.println(sd+ " String TextNumber" );
		
		String num="123abc";
		
		System.out.println(num);
		
		
		int len=st.length();
//		
		
		System.out.println(len);
		
		System.out.println(st.length());
		
		System.out.println(st.charAt(6));
		System.out.println(sd.concat("456"));
		System.out.println(sd.concat(num));
		System.out.println(num.contains("3a"));
		System.out.println(num.endsWith("abc"));
		System.out.println(num.startsWith("abc"));
		
	
		boolean vm=num.startsWith("abc");
	System.out.println(num.equals(sd));
	System.out.println(vm);
	System.out.println(num.equalsIgnoreCase("123ABC")+" equal ignore case");
	
	System.out.println(num.indexOf("a"));
	
	System.out.println(st.indexOf("r", 3)+"witthindex of"); //jjyjhnj
		
		System.out.println(st.replace('c','m'));
		
		System.out.println(st.substring(4));
		
		//System.out.println(st.substring(1,8));//exception
		
		System.out.println(st.toLowerCase());
		
		System.out.println(st.trim()+"trim");
		
		
		
		
		

	}

}
