package javaprograms;

public class PrintDifferentVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "#vcen123try$";
		
	    String [] split = str.split("");
		String name = "";
		String numbers = "";
		String characters = "";
		
		
	for(int i=0;i<split.length;i++) {
	
	if(split[i].matches("[a-z]")) {
		
		name =  name+split[i];
		
	}
	else if(split[i].matches("[0-9]")) {
		 numbers = numbers  + split[i];
	}
	 else {
		characters = characters + split[i];
	}
	
	
	
	}
	System.out.println(name);
	System.out.println(numbers);
	System.out.println(characters);

	}
}

