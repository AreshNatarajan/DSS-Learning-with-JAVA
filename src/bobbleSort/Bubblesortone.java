package bobbleSort;
import java.util.Random;
import java.util.*;

public class Bubblesortone {

    public static void main(String[] a) {

        ArrayList<Integer> array = new ArrayList<>();
        Random randomNumber = new Random();

       
        for (int i = 0; i < 10; i++) {
            int randomInt = randomNumber.nextInt(100);
            array.add(randomInt);
        }

        System.out.println("Before sorting: " + array);

        
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - 1 - i; j++) {
                if (array.get(j) < array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }

        System.out.println("After sorting (descending): " + array);
    }
}
