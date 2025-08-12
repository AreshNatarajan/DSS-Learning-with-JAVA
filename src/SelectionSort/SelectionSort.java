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

		System.out.println(Array);

		int ArraySize = Array.size();

		for (int i = 0; i < ArraySize - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < ArraySize; j++) {

				if (Array.get(j) < Array.get(minIndex)) {

					minIndex = j;
				}

			}
			
			if (minIndex != i) {
				int temp = Array.get(i);
				Array.set(i, Array.get(minIndex));
				Array.set(minIndex, temp);
			}
		}
		
		System.out.println("Sorted Array " + Array);

	}

}
