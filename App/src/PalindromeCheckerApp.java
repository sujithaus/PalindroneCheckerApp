

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Input string to be checked
        String input = "madam";
        String reversed = "";

        // UC3 Flow Step 1: Reverse string using loop
        // Hint: Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            // Using String Concatenation (+) to build the reversed string
            reversed = reversed + input.charAt(i);
        }

        // UC3 Flow Step 2 & 3: Compare and Display result
        // Use equals() to compare content instead of memory references
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}