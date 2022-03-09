package homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arrays = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        sortMethod (arrays, arrayList, linkedList);

    }
    private static void sortMethod (int[] array, ArrayList arrayList, LinkedList linkedList) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumbers = random.nextInt(2);
            array[i] = randomNumbers;
            arrayList.add(randomNumbers);
            linkedList.add(randomNumbers);
        }
        System.out.println("Before sort: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sort " + Arrays.toString(array) + "\n");

        System.out.println("Before sort: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("After sort: " + arrayList + "\n");

        System.out.println("Before sort: " + linkedList);
        Collections.sort(linkedList);
        System.out.println("After sort " + linkedList + "\n");
    }
}
