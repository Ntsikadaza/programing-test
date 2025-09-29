public class CricketRunsReport {
    public static void main(String[] args) {
        // 1D array for batsmen names
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB De Villiers"};

        // 1D array for stadium names
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};

        // 2D array for runs scored [stadium][batsman]
        int[][] runs = {
            {5000, 3800, 4200},  // Kingsmead
            {3500, 3700, 3900},  // St Georges
            {6200, 5000, 5200}   // Wanderers
        };

        // Array for total runs per batsman
        int[] batsmanTotals = new int[batsmen.length];

        // Array for total runs per stadium
        int[] stadiumTotals = new int[stadiums.length];

        // Calculate totals
        for (int i = 0; i < stadiums.length; i++) {
            for (int j = 0; j < batsmen.length; j++) {
                batsmanTotals[j] += runs[i][j];  // sum for each batsman
                stadiumTotals[i] += runs[i][j];  // sum for each stadium
            }
        }

        // Print report header
        System.out.printf("%-12s %-15s %-15s %-15s %-10s%n", 
                          "Stadium", batsmen[0], batsmen[1], batsmen[2], "Total");

        // Print rows with stadium totals
        for (int i = 0; i < stadiums.length; i++) {
            System.out.printf("%-12s", stadiums[i]);
            for (int j = 0; j < batsmen.length; j++) {
                System.out.printf(" %-15d", runs[i][j]);
            }
            System.out.printf(" %-10d%n", stadiumTotals[i]);
        }

        // Print batsman totals
        System.out.printf("%-12s", "TOTAL");
        for (int j = 0; j < batsmen.length; j++) {
            System.out.printf(" %-15d", batsmanTotals[j]);
        }
        System.out.println();

        // Find stadium with most runs
        int maxRuns = stadiumTotals[0];
        String bestStadium = stadiums[0];
        for (int i = 1; i < stadiums.length; i++) {
            if (stadiumTotals[i] > maxRuns) {
                maxRuns = stadiumTotals[i];
                bestStadium = stadiums[i];
            }
        }

        System.out.println("\nStadium with most runs: " + bestStadium + " (" + maxRuns + " runs)");
    }
}