import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ============================================================================
 * UC13: Performance Comparison
 */
public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeStrategy strategy = new StackStrategy();

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Start measurement
        long startTime = System.nanoTime();

        boolean isPalindrome = strategy.check(input);

        // End measurement
        long endTime = System.nanoTime();

        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + (endTime - startTime) + " ns");

        scanner.close();
    }
}

/**
 * Strategy pattern interface for palindrome algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Implementation using a Stack data structure.
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null || input.isEmpty()) return true;

        //
        // This stack stores characters to reverse the input string order
        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop and compare characters (LIFO order reverses the input)
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}