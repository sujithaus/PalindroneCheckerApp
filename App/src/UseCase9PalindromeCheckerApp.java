import java.util.Scanner;

/**
 * ============================================================================
 * MAIN CLASS - UseCase9RecursivePalindrome
 * ============================================================================
 * * Use Case 9: Recursive Palindrome Checker
 * * Description:
 * This class validates a palindrome using recursion.
 * * Characters are compared from the outer positions
 * moving inward using recursive calls.
 * * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 * * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 * * @author Developer
 * @version 9.0
 */
public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Standardize input: remove spaces and convert to lowercase for accurate checking
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        // Initial call: start at 0, end at length - 1
        boolean isPalindrome = check(cleanInput, 0, cleanInput.length() - 1);

        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }

    /**
     * Recursively checks whether a string is a palindrome.
     * * @param s      Input string
     * @param start  Starting index
     * @param end    Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // BASE CONDITION 1: If pointers cross or meet, all characters matched
        if (start >= end) {
            return true;
        }

        // RECURSIVE STEP: Compare start and end
        if (s.charAt(start) == s.charAt(end)) {
            // Move inward by incrementing start and decrementing end
            return check(s, start + 1, end - 1);
        }

        // BASE CONDITION 2: Mismatch found
        return false;
    }
}