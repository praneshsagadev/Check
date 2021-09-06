package javaprograms;


import java.util.Iterator;

import java.util.TreeSet;

public class DuplicateNumber {
	 

	public static void main(String[] args) {

//		String names[] = {"Java","C","JavaScript","Ruby","C","C","Java","JavaScript"};
//		Set<String> store = new HashSet<String>();
//		
//		for(String str : names) {
//			
//			if(store.add(str)==false) {
//				System.out.println(str);
//			}
//		}

		int numbers[] = { 1, 2, 2, 3, 4, 3, 4, 2 ,4,4};
		
		 TreeSet tree = new TreeSet();
		
	


		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
//					System.out.println(numbers[j]);
					tree.add(numbers[j]);
					
				}
				
			}
		}
		Iterator it = tree.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
