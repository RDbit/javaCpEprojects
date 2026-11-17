
package CPEProblem8;

import javax.swing.*;
import java.awt.GridLayout;

public class GCD {
    public static void main(String[] args) {

        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();

        JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));

        panel.add(new JLabel("Enter first integer:"));
        panel.add(num1Field);

        panel.add(new JLabel("Enter second integer:"));
        panel.add(num2Field);

        int result = JOptionPane.showConfirmDialog(
            null,
            panel,
            "GCD Calculator",
            JOptionPane.OK_CANCEL_OPTION
        );

        if (result == JOptionPane.OK_OPTION) {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                if (num1 == 0 && num2 == 0) {
                    JOptionPane.showMessageDialog(
                        null,
                        "GCD is undefined for two zeros."
                    );
                } else {
                    int gcd = findGCD(Math.abs(num1), Math.abs(num2));

                    JOptionPane.showMessageDialog(
                        null,
                        "GCD of " + num1 + " and " + num2 + " is " + gcd
                    );
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                    null,
                    "Please enter valid integers."
                );
            }
        }
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
