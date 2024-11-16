import java.util.Random;

public class practicePervoezadanie {
    public static void main(String[] args) {
        int size = 12;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nКоличество парных: " + evenCount);
        System.out.println("Количество непарных: " + oddCount);
    }
}
