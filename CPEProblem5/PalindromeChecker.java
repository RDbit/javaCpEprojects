package CPEProblem5;
import javax.swing.JOptionPane;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number:");
        int number = Integer.parseInt(input);
        
        // Handle negative numbers
        if (number < 0) {
            JOptionPane.showMessageDialog(null, "Negative numbers are not palindromes");
            return;
        }
        
        // Method 1: Convert to string and compare
        String numStr = String.valueOf(number);
        boolean isPalindrome = true;
        
        for (int i = 0; i < numStr.length() / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            JOptionPane.showMessageDialog(null, number + " is a palindrome");
        } else {
            JOptionPane.showMessageDialog(null, number + " is not a palindrome");
        }
    }
}