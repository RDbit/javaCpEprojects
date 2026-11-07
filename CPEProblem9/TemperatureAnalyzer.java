
package CPEProblem9;

import javax.swing.JOptionPane;

public class TemperatureAnalyzer {

    public static void main(String[] args) {

        // Store daily high temperatures
        int[] temperatures = {
            55, 62, 68, 74, 59, 45, 41, 58, 60,
            67, 65, 78, 82, 88, 91, 92, 90, 93,
            87, 78, 79, 72, 68, 61, 59
        };

        // Initialize counters
        int hotDays = 0;
        int pleasantDays = 0;
        int coldDays = 0;

        // Store the daily classifications
        String result = "DAILY TEMPERATURE REPORT\n";
        result += "============================\n";

        // Process each temperature
        for (int i = 0; i < temperatures.length; i++) {

            int temperature = temperatures[i];

            result += "Day " + (i + 1) + ": "
                    + temperature + " - ";

            if (temperature >= 85) {
                result += "Hot\n";
                hotDays++;

            } else if (temperature >= 60) {
                result += "Pleasant\n";
                pleasantDays++;

            } else {
                result += "Cold\n";
                coldDays++;
            }
        }

        // Add the summary
        result += "\nTEMPERATURE SUMMARY\n";
        result += "============================\n";
        result += "Hot days: " + hotDays + "\n";
        result += "Pleasant days: " + pleasantDays + "\n";
        result += "Cold days: " + coldDays + "\n";
        result += "----------------------------\n";
        result += "Total days: " + temperatures.length;

        // Display results using JOptionPane
        JOptionPane.showMessageDialog(
            null,
            result,
            "Temperature Analyzer",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
