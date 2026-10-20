package lab1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Завдання 3 (Варіант 9) ===");
        System.out.print("Введіть розмірність матриці n (n <= 15): ");
        int n = scanner.nextInt();

        if (n <= 0 || n > 15) {
            System.out.println("Помилка: n має бути від 1 до 15.");
            scanner.close();
            return;
        }

        int[][] matrix = new int[n][n];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nВведена матриця:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // 1. Пошук рядків із однаковими елементами
        System.out.println("\nРядки, у яких всі елементи однакові:");
        boolean foundRow = false;
        for (int i = 0; i < n; i++) {
            boolean allSame = true;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i][0]) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                System.out.println("Номер рядка: " + (i + 1) + " (індекс " + i + ")");
                foundRow = true;
            }
        }
        if (!foundRow) {
            System.out.println("Таких рядків немає.");
        }

        // 2. Пошук стовпчиків із всіма парними елементами
        System.out.println("\nСтовпчики, у яких всі елементи парні:");
        boolean foundCol = false;
        for (int j = 0; j < n; j++) {
            boolean allEven = true;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] % 2 != 0) {
                    allEven = false;
                    break;
                }
            }
            if (allEven) {
                System.out.println("Номер стовпчика: " + (j + 1) + " (індекс " + j + ")");
                foundCol = true;
            }
        }
        if (!foundCol) {
            System.out.println("Таких стовпчиків немає.");
        }

        scanner.close();
    }
}