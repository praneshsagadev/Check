package programs;

public class PrintWordsInString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Selenium Automation testing";
		String[] str1 =str.split(" ");
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
		}

	}

}
