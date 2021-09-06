package programs;

public class PrintWordsInstring {

	public static void main(String[] args) {
		
		String s2 = "This is a text and we should print each word";
		int i ,j;
		
		for(i=0;i<s2.length();i++) {
			if(s2.substring(i).startsWith("")||i==0) {
				for(j=i+1;j<=s2.length();j++) {
					
					if(s2.substring(j).startsWith("")||j==s2.length()) {
						
						System.out.print(s2.substring(i,j));
						
						i=j;
					}
					System.out.println();	
				}
			
			}
			
		}
		
		

	}

}
