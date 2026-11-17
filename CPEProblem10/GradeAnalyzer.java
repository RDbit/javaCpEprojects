
package CPEProblem10;

import javax.swing.JOptionPane;

public class GradeAnalyzer {

    public static void main(String[] args) {

        int totalGrades = 0;
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;

        String input = JOptionPane.showInputDialog(
            "Enter exam score (0-100):\nEnter a negative number to stop."
        );

        if (input == null) {
            return;
        }

        int score = Integer.parseInt(input);

        while (score >= 0) {

            if (score > 100) {

                JOptionPane.showMessageDialog(
                    null,
                    "Invalid score! Enter a score between 0 and 100."
                );

            } else {

                totalGrades++;

                if (score >= 90) {
                    gradeA++;

                } else if (score >= 80) {
                    gradeB++;

                } else if (score >= 70) {
                    gradeC++;

                } else if (score >= 60) {
                    gradeD++;

                } else {
                    gradeF++;
                }
            }

            input = JOptionPane.showInputDialog(
                "Enter another exam score (0-100):\nEnter a negative number to stop."
            );

            if (input == null) {
                break;
            }

            score = Integer.parseInt(input);
        }

        String result = "EXAM GRADE SUMMARY\n";
        result += "========================\n";
        result += "Total number of grades = " + totalGrades + "\n\n";

        result += "Number of A's = " + gradeA + "\n";
        result += "Number of B's = " + gradeB + "\n";
        result += "Number of C's = " + gradeC + "\n";
        result += "Number of D's = " + gradeD + "\n";
        result += "Number of F's = " + gradeF + "\n";

        result += "========================";

        JOptionPane.showMessageDialog(
            null,
            result,
            "Grade Analyzer",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
