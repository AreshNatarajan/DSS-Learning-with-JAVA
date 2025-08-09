package SelectionSort;

import java.util.*;

public class SelectionSort {
	public static void main(String[] a) {

		ArrayList<Integer> Array = new ArrayList<Integer>();
		Random randomeNumber = new Random();

		for (int i = 0; i < 10; i++) {
			int x = randomeNumber.nextInt(100);
			Array.add(x);
		}
		
		int n = Array.size();
		
		for(int i = 0; i < n -1; i++) {
			
			int minIndex = Array.get(i);
			
			for(int j = i + 1; j < n ; j++) {
				
               
				if(Array.get(j) < Array.get(minIndex)) {
					
					
					
				}
				
				
			}
			
			
		}

		System.out.println(Array);
	}

}
