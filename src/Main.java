import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Task:");
        int task = scanner.nextInt();
        if (task == 1) {
            task1();
        } else if (task == 2) {
            task2();
        } else if (task == 3) {
            task3();
        } else if (task == 4) {
            task4();
        }
    }

    public static void task1() {
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
            double res2 = ((double) (n2 + 1) * (m2 - 4) + (double) n2 * m2 - Math.pow(n2, 4) + Math.pow(m2, 3)) / Math.pow(m2 + 2, 2);
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
    public static void task2() {
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
    public static void task3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Завдання 3 (Варіант 9)");
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
    public static boolean isLexicographical(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Завдання 4 (Варіант 9)");
        System.out.println("Введіть текст із малих латинських літер:");
        String text = scanner.nextLine();
        String[] words = text.split("[\\s,.:;-?!()\\[\\]\"]+");

        System.out.println("\nСлова, букви в яких розміщені в лексикографічному порядку:");
        boolean found = false;

        for (String word : words) {
            if (!word.isEmpty()) {
                if (isLexicographical(word)) {
                    System.out.println("- " + word);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Таких слів не знайдено.");
        }

        scanner.close();
    }
}

