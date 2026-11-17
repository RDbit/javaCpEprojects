package CPEProblem2;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class limanuminput {
    public static void main(String[] args) {

        int[] jayint = new int[5];

        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog(
                null,
                "Enter number " + (i + 1) + ":",
                "Input",
                JOptionPane.QUESTION_MESSAGE
            );

            jayint[i] = Integer.parseInt(input);
        }

        Arrays.sort(jayint);

        int lowest = jayint[0];
        int highest = jayint[4];

        StringBuilder ascending = new StringBuilder();
        for (int num : jayint) {
            ascending.append(num).append(" ");
        }
        StringBuilder descending = new StringBuilder();
        for (int i = jayint.length - 1; i >= 0; i--) {
            descending.append(jayint[i]).append(" ");
        }
        String result =
            "Entered Numbers: " + Arrays.toString(jayint) +
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