public class Team {

    private String name;
    private int numGames;
    private int wins;
    private int losses;

    public Team(String name) {
        this.name = name;
        numGames = 0;
        wins = 0;
        losses = 0;
    }

    public String getName() {
        return name;
    }

    public void incrementWins() {
        wins++;
    }

    public void decrementWins() {
        wins--;
    }

    public void incrementLosses() {
        losses++;
    }

    public void incrementNumGames() {
        numGames++;
    }

    public String toString() {
        return "Games: " + numGames + "\nWins: " + wins + "\nLosses: " + losses;
    }
}