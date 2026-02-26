







                public class PalindromeCheckerApp {

                    /**
                     * Application entry point for UC7.
                     * @param args Command-line arguments
                     */
                    public static void main(String[] args) {
                        // Step 1: Define the input string
                        String input = "refer";

                        // Step 2: Create a Deque to store characters
                        Deque<Character> deque = new ArrayDeque<>();

                        // Step 3: Add each character to the deque
                        for (char c : input.toCharArray()) {
                            deque.add(c);
                        }

                        // Step 4: Flag to track palindrome result
                        boolean isPalindrome = true;

                        // Step 5: Continue comparison while more than one element exists
                        while (deque.size() > 1) {
                            // Remove from both ends and compare
                            if (!deque.removeFirst().equals(deque.removeLast())) {
                                isPalindrome = false;
                                break;
                            }
                        }

                        // Step 6: Display the result
                        System.out.println("Input : " + input);
                        System.out.println("Is Palindrome? : " + isPalindrome);
                    }
                }