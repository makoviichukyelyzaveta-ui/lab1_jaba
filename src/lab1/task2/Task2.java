package lab1.task2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ЗАВДАННЯ 2");
        System.out.println("\nВаріант 1 (double -> double)");
        System.out.print("Введіть розмір масиву n: ");
        int n1 = scanner.nextInt();
        double[] a1 = new double[n1];
        System.out.println("Введіть елементи масиву (double):");
        for (int i = 0; i < n1; i++) a1[i] = scanner.nextDouble();

        processArrayDouble(a1);
        System.out.println("\nВаріант 2 (int -> double)");
        System.out.print("Введіть розмір масиву n: ");
        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Введіть елементи масиву (int):");
        for (int i = 0; i < n2; i++) a2[i] = scanner.nextInt();

        processArrayIntToDouble(a2);
        System.out.println("\nВаріант 3 (double -> int)");
        System.out.print("Введіть розмір масиву n: ");
        int n3 = scanner.nextInt();
        double[] a3 = new double[n3];
        System.out.println("Введіть елементи масиву (double):");
        for (int i = 0; i < n3; i++) a3[i] = scanner.nextDouble();

        processArrayDoubleToInt(a3);

        scanner.close();
    }
    private static void processArrayDouble(double[] arr) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (first == -1) first = i;
                last = i;
            }
        }
        if (first == -1 || first == last) {
            System.out.println("Від'ємних чисел немає або воно лише одне.");
        } else {
            double sum = 0;
            for (int i = first + 1; i < last; i++) sum += arr[i];
            System.out.println("Діапазон: від індексу " + (first + 1) + " до " + (last - 1));
            System.out.printf("Сума (double): %.4f\n", sum);
        }
    }
    private static void processArrayIntToDouble(int[] arr) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (first == -1) first = i;
                last = i;
            }
        }
        if (first == -1 || first == last) {
            System.out.println("Від'ємних чисел немає або воно лише одне.");
        } else {
            double sum = 0;
            for (int i = first + 1; i < last; i++) sum += arr[i];
            System.out.println("Діапазон: від індексу " + (first + 1) + " до " + (last - 1));
            System.out.printf("Сума (double): %.4f\n", sum);
        }
    }
    private static void processArrayDoubleToInt(double[] arr) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (first == -1) first = i;
                last = i;
            }
        }
        if (first == -1 || first == last) {
            System.out.println("Від'ємних чисел немає або воно лише одне.");
        } else {
            double tempSum = 0;
            for (int i = first + 1; i < last; i++) tempSum += arr[i];
            int sum = (int) tempSum;
            System.out.println("Діапазон: від індексу " + (first + 1) + " до " + (last - 1));
            System.out.println("Сума (int): " + sum);
        }
    }
}