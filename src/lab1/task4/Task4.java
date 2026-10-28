package lab1.task4;
import java.util.Scanner;

public class Task4 {

    // Перевірка, чи розташовані букви слова в лексикографічному порядку
    public static boolean isLexicographical(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Завдання 4 (Варіант 9) ===");
        System.out.println("Введіть текст із малих латинських літер:");
        String text = scanner.nextLine();

        // Розбиття тексту на слова (ігноруючи пробіли та розділові знаки)[cite: 8, 9]
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
