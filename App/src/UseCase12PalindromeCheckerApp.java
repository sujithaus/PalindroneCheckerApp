import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ============================================================================
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * This class demonstrates how different palindrome validation algorithms
 * can be selected dynamically at runtime.
 */
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Context: We use the strategy interface to allow for future algorithm swapping
        PalindromeStrategy strategy = new StackStrategy();

        System.out.print("Input : ");
        String input = scanner.nextLine();

        boolean isPalindrome = strategy.check(input);

        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}

/**
 * INTERFACE - PalindromeStrategy
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Implements palindrome validation using the LIFO behavior of a Stack.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }

        // Properly initialized stack
        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop and compare to reverse the string
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}