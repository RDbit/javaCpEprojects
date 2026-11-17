
package CPEProblem6;

import javax.swing.*;
import java.awt.GridLayout;

public class DayNumberCalculator {

    public static void main(String[] args) {

        JTextField monthField = new JTextField();
        JTextField dayField = new JTextField();
        JTextField yearField = new JTextField();

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        panel.add(new JLabel("Enter month (1-12):"));
        panel.add(monthField);

        panel.add(new JLabel("Enter day:"));
        panel.add(dayField);

        panel.add(new JLabel("Enter year:"));
        panel.add(yearField);

        int result = JOptionPane.showConfirmDialog(
            null,
            panel,
            "Day Number Calculator",
            JOptionPane.OK_CANCEL_OPTION
        );

        if (result == JOptionPane.OK_OPTION) {

            try {
                int month = Integer.parseInt(monthField.getText());
                int day = Integer.parseInt(dayField.getText());
                int year = Integer.parseInt(yearField.getText());

                int dayNumber = calculateDayNumber(month, day, year);

                if (dayNumber == -1) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Invalid date!\nPlease enter a valid date."
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Date: " + month + "/" + day + "/" + year
                        + "\nDay Number: " + dayNumber
                        + "\nLeap Year: " + (isLeapYear(year) ? "Yes" : "No")
                    );
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter integers only.");
            }
        }
    }

    public static int calculateDayNumber(int month, int day, int year) {

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (year < 1 || month < 1 || month > 12) {
            return -1;
        }

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        if (day < 1 || day > daysInMonth[month - 1]) {
            return -1;
        }

        int totalDays = 0;

        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        totalDays += day;

        return totalDays;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }
}
