/**
    Team.java
    Rich Lomax
    CIS 505
    August, 2022
    A class to represent a sports team.
*/
  
public class Team {
    private String gTeamName;
    private String[] gPlayers;
    private int gPlayerCount;
    
    /**
     * Constructor to replace the no-argument constructor
     */
    public Team() {
      super();
      gPlayers = new String[20];
      gTeamName = "";
      gPlayerCount = 0;
    }
    
    /**
     * Constructor with a team name as an argument
     */
    public Team(String name) {
        this(); // call the local no-argument constructor
        gTeamName = name;
    }
    
    /**
     * Method to add a player to the gPlayers array
     */
    public void addPlayer(String playerName) {
        if (gPlayerCount < gPlayers.length) {
            gPlayers[gPlayerCount++] = playerName;
        }
    }
    
    /**
     * Accessor method for gPlayers
     */
    public String[] getPlayers() {
        return this.gPlayers;
    }
    
    /**
     * Accessor method for gPlayerCount
     */
    public int getPlayerCount() {
        return this.gPlayerCount;
    }
    
    /**
     * Accessor method for team name
     */
    public String getTeamName() {
        return this.gTeamName;
    }
    
}
