
package CPEProblem6;

import javax.swing.JOptionPane;

public class DayNumberCalculator {

    public static void main(String[] args) {

        // Get input from the user
        int month = Integer.parseInt(
            JOptionPane.showInputDialog("Enter month (1-12):")
        );

        int day = Integer.parseInt(
            JOptionPane.showInputDialog("Enter day:")
        );

        int year = Integer.parseInt(
            JOptionPane.showInputDialog("Enter year:")
        );

        // Calculate the day number
        int dayNumber = calculateDayNumber(month, day, year);

        // Display the result
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
    }

    // Method to calculate the day number
    public static int calculateDayNumber(int month, int day, int year) {

        // Days in each month
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Check if the year is valid
        if (year < 1) {
            return -1;
        }

        // Check if the month is valid
        if (month < 1 || month > 12) {
            return -1;
        }

        // Adjust February for leap years
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        // Check if the day is valid
        if (day < 1 || day > daysInMonth[month - 1]) {
            return -1;
        }

        // Calculate the total number of days
        int totalDays = 0;

        // Add the days of previous months
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        // Add the current day
        totalDays += day;

        return totalDays;
    }

    // Method to determine if the year is a leap year
    public static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }
}
