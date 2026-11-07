package CPEProblem7;
import javax.swing.JOptionPane;

public class PrimeChecker {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number:");
        int number = Integer.parseInt(input);
        
        if (number < 2) {
            JOptionPane.showMessageDialog(null, number + " is neither prime nor composite");
        } else if (isPrime(number)) {
            JOptionPane.showMessageDialog(null, number + " is a prime number");
        } else {
            JOptionPane.showMessageDialog(null, number + " is a composite number");
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        
        // Check for divisors from 5 to sqrt(n)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}