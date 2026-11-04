package CPEProblem1;
import javax.swing.JOptionPane;

public class createArithmeticSeq{
    public static void main(String[] args){
        String first1 = JOptionPane.showInputDialog("put the first: ");
        int first = Integer.parseInt(first1);

        String diff1 = JOptionPane.showInputDialog("put the diff: ");
        int diff = Integer.parseInt(diff1);

        for (int ardzs = 1; ardzs <= 16; ardzs++){
            System.out.print(first + diff);

        }
    }
}
