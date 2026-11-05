package CPEProblem4;
import javax.swing.JOptionPane;

public class triangle {
    public static void main(String[] args) {
        String side1Input = JOptionPane.showInputDialog("Enter the first side:");
        double side1 = Double.parseDouble(side1Input);
        
        String side2Input = JOptionPane.showInputDialog("Enter the second side:");
        double side2 = Double.parseDouble(side2Input);
        
        String side3Input = JOptionPane.showInputDialog("Enter the third side:");
        double side3 = Double.parseDouble(side3Input);
        
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            if (side1 == side2 && side2 == side3) {
                JOptionPane.showMessageDialog(null, "The triangle is Equilateral");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                JOptionPane.showMessageDialog(null, "The triangle is Isosceles");
            } else {
                JOptionPane.showMessageDialog(null, "The triangle is Scalene");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid triangle: The sides don't form a valid triangle");
        }
    }
}

