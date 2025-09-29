package runapplication;

import java.util.Scanner;

// Interface
interface ICricket {
    String getBatsman();
    String getStadium();
    int getRunsScored();
}

// Abstract class
abstract class Cricket implements ICricket {
    protected String batsmanName;
    protected String stadiumName;
    protected int totalRunsScored;

    // Constructor
    public Cricket(String batsmanName, String stadiumName, int totalRunsScored) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.totalRunsScored = totalRunsScored;
    }

    // Implement interface methods
    @Override
    public String getBatsman() {
        return batsmanName;
    }

    @Override
    public String getStadium() {
        return stadiumName;
    }

    @Override
    public int getRunsScored() {
        return totalRunsScored;
    }
}

// Subclass
class CricketRunsScored extends Cricket {

    // Constructor
    public CricketRunsScored(String batsmanName, String stadiumName, int totalRunsScored) {
        super(batsmanName, stadiumName, totalRunsScored);
    }

    // Print report
    public void printReport() {
        System.out.println("\nBATSMAN RUNS SCORED REPORT");
        System.out.println("");
        System.out.println("CRICKET PLAYER: " + getBatsman());
        System.out.println("STADIUM: " + getStadium());
        System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
    }
}

// Main application
public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("The cricketer name: ");
        String name = sc.nextLine();

        System.out.print("Enter the stadium: ");
        String stadium = sc.nextLine();

        System.out.print("Enter the total runs scored by " + name + " at " + stadium + ": ");
        int runs = sc.nextInt();

        // Create object and print report
        CricketRunsScored cr = new CricketRunsScored(name, stadium, runs);
        cr.printReport();

        sc.close();
    }
}