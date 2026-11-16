package CPEProblem2;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class limanuminput {
    public static void main(String[] args) {

        int[] girlint = new int[5];

        // Input 5 numbers
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog(
                null,
                "Enter number " + (i + 1) + ":",
                "Input",
                JOptionPane.QUESTION_MESSAGE
            );

            girlint[i] = Integer.parseInt(input);
        }

        // Sort numbers in ascending order
        Arrays.sort(girlint);

        // Get highest and lowest numbers
        int lowest = girlint[0];
        int highest = girlint[4];

        // Display ascending order
        StringBuilder ascending = new StringBuilder();
        for (int num : girlint) {
            ascending.append(num).append(" ");
        }

        // Display descending order
        StringBuilder descending = new StringBuilder();
        for (int i = girlint.length - 1; i >= 0; i--) {
            descending.append(girlint[i]).append(" ");
        }

        // Display results
        String result =
            "Entered Numbers: " + Arrays.toString(girlint) +
            "\n\nHighest Number: " + highest +
            "\nLowest Number: " + lowest +
            "\n\nAscending Order: " + ascending +
            "\nDescending Order: " + descending;

        JOptionPane.showMessageDialog(
            null,
            result,
            "Number Results",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}