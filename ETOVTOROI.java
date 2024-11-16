import java.util.Scanner;

public class ETOVTOROI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("укажите количество углов вашего многоугольника: ");
        int n = scanner.nextInt();
        int[] angles = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("введите угол " + (i + 1) + ": ");
            angles[i] = scanner.nextInt();
            sum += angles[i];
        }

        int expectedSum = 180 * (n - 2);
        System.out.println("Сумма градусных мер углов: " + sum);
        System.out.println("Ожидданная сумма углов для многоугольника с " + n + " углов: " + expectedSum);

        if (sum == expectedSum) {
            System.out.println("Этот многоугольник - существет.");
        } else {
            System.out.println("Этот многоугольник - не может существовать.");
        }
    }
}