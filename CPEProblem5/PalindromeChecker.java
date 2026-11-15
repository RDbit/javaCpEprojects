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
