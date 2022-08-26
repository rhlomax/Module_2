/**
    TestSportsTeamApp.java
    Rich Lomax
    CIS 505
    August, 2022
    A class to test the Team class
*/
import java.util.Arrays;
import java.util.Scanner;
  
public class TestSportsTeamApp {
    
    /**
     * Constructor to replace the no-argument constructor
     */
    public TestSportsTeamApp() {
      super();
    }
    
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Obtain a Scanner for the console:
        Scanner lScanner = new Scanner(System.in);
        // Print welcome message:
        System.out.println("  Welcome to the Sports Team App");
        // Set a flag to allow multiple runs:
        boolean lKeepGoing = true;
        while (lKeepGoing) {
            // Prompt for a team name:
            System.out.print("\n  Enter a team name: ");
            // Read the team name, creating a new Team object at the same time:
            Team lTeam = new Team(lScanner.nextLine());
            // Prompt for players:
            System.out.print("\n  Enter the player names:\n    hint: use commas for multiple players; no spaces>: ");
            // Read the player's names, creating an array at the same time:
            String[] lTheTeam = lScanner.nextLine().split(",");
            // Loop through the players, adding them to the team:
            for (String lPlayer: lTheTeam) {
                lTeam.addPlayer(lPlayer);
            }
            // Get the player list from the Team object:
            String[] lThePlayers = lTeam.getPlayers();
            // Output header:
            System.out.println("\n  --Team Summary--");
            System.out.printf("  Number of players in team: %d\n  Players on team: ", lTeam.getPlayerCount());
            for(int lPlayerNr = 0; lPlayerNr < lTeam.getPlayerCount(); lPlayerNr++) {
                if (lPlayerNr > 0) {    // Skip leading comma for first player
                    System.out.print(",");
                }
                System.out.print(lThePlayers[lPlayerNr]);
            }
            // Prompt for more:
            System.out.print("\n\n  Continue? (y/n): ");
            String lAnswer = lScanner.nextLine();
            lKeepGoing = lAnswer.equalsIgnoreCase("y");
        }
        // Exit gracefully:
        System.exit(0);
    }
    
}
