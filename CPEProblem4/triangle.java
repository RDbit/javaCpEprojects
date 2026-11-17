
package CPEProblem4;

import javax.swing.*;
import java.awt.GridLayout;

public class triangle {
    public static void main(String[] args) {

        JTextField side1Field = new JTextField();
        JTextField side2Field = new JTextField();
        JTextField side3Field = new JTextField();

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        panel.add(new JLabel("Enter the first side:"));
        panel.add(side1Field);

        panel.add(new JLabel("Enter the second side:"));
        panel.add(side2Field);

        panel.add(new JLabel("Enter the third side:"));
        panel.add(side3Field);

        int result = JOptionPane.showConfirmDialog(
            null,
            panel,
            "Triangle Side Input",
            JOptionPane.OK_CANCEL_OPTION
        );

        if (result == JOptionPane.OK_OPTION) {

            double side1 = Double.parseDouble(side1Field.getText());
            double side2 = Double.parseDouble(side2Field.getText());
            double side3 = Double.parseDouble(side3Field.getText());

            if (side1 > 0 && side2 > 0 && side3 > 0 &&
                side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1) {

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
}
