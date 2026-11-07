package CPEProblem8;
import javax.swing.JOptionPane;

public class GCD {
    public static void main(String[] args) {
        // Get two integers from user
        String input1 = JOptionPane.showInputDialog("Enter first integer:");
        int num1 = Integer.parseInt(input1);
        
        String input2 = JOptionPane.showInputDialog("Enter second integer:");
        int num2 = Integer.parseInt(input2);
        
        // Find GCD using Euclidean algorithm
        int result = findGCD(Math.abs(num1), Math.abs(num2));
        
        JOptionPane.showMessageDialog(null, "GCD of " + num1 + " and " + num2 + " is " + result);
    }
    
    public static int findGCD(int a, int b) {
        // Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}