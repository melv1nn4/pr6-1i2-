import java.util.Scanner;

public class treteezadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("установите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("начальный массив:");
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        System.out.print("\nвведите значение которое вы хотели бы заменить: ");
        int valueToFind = scanner.nextInt();
        System.out.print("введите новое значение: ");
        int newValue = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] == valueToFind) {
                array[i] = newValue;
            }
        }

        System.out.println("итоговый массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
