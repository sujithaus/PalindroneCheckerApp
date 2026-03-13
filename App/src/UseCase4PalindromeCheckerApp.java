import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

/**
 * ============================================================================
 * MAIN CLASS - UseCase14PalindromeCheckerApp
 * ============================================================================
 * UC14: Palindrome Validation using Deque
 */
public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeStrategy strategy = new DequeStrategy();

        System.out.print("Input : ");
        String input = scanner.nextLine();

        boolean isPalindrome = strategy.check(input);

        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}

/**
 * Interface defining the strategy contract.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Implementation using a Deque (Double-Ended Queue)
 */
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null || input.isEmpty()) return true;

        //
        // A Deque allows adding/removing from both ends efficiently
        Deque<Character> deque = new ArrayDeque<>();

        // Add all characters to the Deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Compare first and last characters iteratively
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                return false; // Mismatch found
            }
        }
        return true; // No mismatches, it's a palindrome
    }
}