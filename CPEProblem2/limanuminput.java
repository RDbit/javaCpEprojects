package CPEProblem2;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class limanuminput{
    public static void main(String[] args){
        int[] limaint = new int[5];

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog(null, "Enter number " + (i + 1) + ":", "input", JOptionPane.QUESTION_MESSAGE);
            limaint[i] = Integer.parseInt(input); 
        }
        Arrays.sort(limaint);

        StringBuilder result = new StringBuilder("Sorted numbers: ");
        for (int num : limaint) {
            result.append(num).append(" ");
        }
        JOptionPane.showMessageDialog(null, result.toString());
    }
}
    


