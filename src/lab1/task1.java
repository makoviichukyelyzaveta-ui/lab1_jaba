package lab1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ЗАВДАННЯ 1");

        // Варіант 1: double -> double
        System.out.println("\nВаріант 1 (double -> double)");
        System.out.print("Введіть n (double): ");
        double n1 = scanner.nextDouble();
        System.out.print("Введіть m (double): ");
        double m1 = scanner.nextDouble();

        if (Math.abs(m1 - (-2)) < 1e-9) { // Безпечна перевірка для double
            System.out.println("Помилка: ділення на нуль!");
        } else {
            double res1 = ((n1 + 1) * (m1 - 4) + n1 * m1 - Math.pow(n1, 4) + Math.pow(m1, 3)) / Math.pow(m1 + 2, 2);
            System.out.printf("Результат (double): %.4f\n", res1);
        }

        // Варіант 2: int -> double
        System.out.println("\nВаріант 2 (int -> double)");
        System.out.print("Введіть n (int): ");
        int n2 = scanner.nextInt();
        System.out.print("Введіть m (int): ");
        int m2 = scanner.nextInt();

        if (m2 == -2) {
            System.out.println("Помилка: ділення на нуль!");
        } else {
            double res2 = ((double)(n2 + 1) * (m2 - 4) + (double)n2 * m2 - Math.pow(n2, 4) + Math.pow(m2, 3)) / Math.pow(m2 + 2, 2);
            System.out.printf("Результат (double): %.4f\n", res2);
        }

        // Варіант 3: double -> int
        System.out.println("\n Варіант 3 (double -> int)");
        System.out.print("Введіть n (double): ");
        double n3 = scanner.nextDouble();
        System.out.print("Введіть m (double): ");
        double m3 = scanner.nextDouble();

        if (Math.abs(m3 - (-2)) < 1e-9) {
            System.out.println("Помилка: ділення на нуль!");
        } else {
            double temp = ((n3 + 1) * (m3 - 4) + n3 * m3 - Math.pow(n3, 4) + Math.pow(m3, 3)) / Math.pow(m3 + 2, 2);
            int res3 = (int) temp; // Приведення до цілого
            System.out.println("Результат (int): " + res3);
        }

        scanner.close();
    }
}