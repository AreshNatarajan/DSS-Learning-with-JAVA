package bobbleSort;
import java.util.*;

public class BubblesortAsc {
	
	public static void main(String[] a) {
		
		Random randomNumber = new Random();
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int radomNumber = randomNumber.nextInt(100);
			array.add(radomNumber);
		}
		
		System.out.println(array);
		
		for(int i = 0; i < array.size() - 1; i++) {
			
			boolean isSwapped = false;
			
			for(int j = 0; j < array.size() - 1 -i; j++) {
				
				if(array.get(j) > array.get(j + 1)) {
					int temp = array.get(j);
					array.set(j, array.get(j + 1));
					array.set(j + 1, temp);
					isSwapped = true;
				}
			}
			
			if(!isSwapped) {
				break;
			}
		}
		
		
		System.out.println(array);
		System.out.println(array.size());
	}

}
