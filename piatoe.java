import java.util.Scanner;

public class piatoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("установите размер массива: ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("размер массива ДОЛЖЕН быть > 0 !!!.");
            return;
        }

        int[] array = new int[size];
        System.out.println("введите елементы вашего массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        if (isOrdered(array, true)) {
            System.out.println("массив увеличивающийся.");
        } else if (isOrdered(array, false)) {
            System.out.println("массив спадающий.");
        } else {
            System.out.println("массив не упорядочен.");
        }
    }

    public static boolean isOrdered(int[] array, boolean ascending) {
        for (int i = 0; i < array.length - 1; i++) {
            if ((ascending && array[i] > array[i + 1]) || (!ascending && array[i] < array[i + 1])) {
                return false;
            }
        }
        return true;
    }
}
