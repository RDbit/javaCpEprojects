package Javahehe;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            String input = JOptionPane.showInputDialog(
                "Enter number " + (i + 1) + ":"
            );

            numbers[i] = Integer.parseInt(input);
        }

        // Sort numbers in ascending order
        Arrays.sort(numbers);

        // Display ascending order
        String ascending = "";
        for (int i = 0; i < numbers.length; i++) {
            ascending += numbers[i] + " ";
        }

        // Display descending order
        String descending = "";
        for (int i = numbers.length - 1; i >= 0; i--) {
            descending += numbers[i] + " ";
        }

        // Get largest and smallest
        int largest = numbers[4];
        int smallest = numbers[0];

        // Display results
        JOptionPane.showMessageDialog(null,
            "Ascending Order: " + ascending +
            "\nDescending Order: " + descending +
            "\nLargest Number: " + largest +
            "\nSmallest Number: " + smallest,
            "Results",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
