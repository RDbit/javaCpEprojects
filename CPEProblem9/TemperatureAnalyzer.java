package CPEProblem9;

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

        System.out.println("DAILY TEMPERATURE REPORT");
        System.out.println("========================");

        // Determine the category of each temperature
        for (int i = 0; i < temperatures.length; i++) {

            int temperature = temperatures[i];

            System.out.print("Day " + (i + 1) + ": "
                    + temperature + " - ");

            if (temperature >= 85) {
                System.out.println("Hot");
                hotDays++;

            } else if (temperature >= 60) {
                System.out.println("Pleasant");
                pleasantDays++;

            } else {
                System.out.println("Cold");
                coldDays++;
            }
        }

        // Display temperature summary
        System.out.println("\nTEMPERATURE SUMMARY");
        System.out.println("========================");

        System.out.println("Hot days: " + hotDays);
        System.out.println("Pleasant days: " + pleasantDays);
        System.out.println("Cold days: " + coldDays);

        System.out.println("------------------------");
        System.out.println("Total days: " + temperatures.length);
    }
}
