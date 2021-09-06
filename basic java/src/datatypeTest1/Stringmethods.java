package datatypeTest1;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String abc = "22/01/2021";
		
		String st = "vcentry1";
		
	String [] def =	abc.split("/");
		
		System.out.println(def[0]);
		//System.out.println(abc.split("/"));
		
		
	String fg =st.replaceAll("[0-9]", "yuu");
	
	System.out.println(fg);
	
	String cf = "1";
	
	//int a =10;
	
	boolean t = cf.matches("[0-9]");
	System.out.println(t);
	
	String str = "vcentry";
	//str.concat(cf);
	System.out.println(str.concat(cf));
	System.out.println(str);
	String sf = str.concat(cf);
	System.out.println(sf);
	
	
	
	
	
	
	}



}
