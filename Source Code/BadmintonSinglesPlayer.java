public class BadmintonSinglesPlayer extends Player {
    private String playingStyle;

    public BadmintonSinglesPlayer(String name, int age, int rank, String country, Gender gender, String playingStyle) {
        super(name, age, rank, country, gender);
        this.playingStyle = playingStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getPlayerId() + ", Name: " + getName() + " (Singles), Rank: " + getRank() + ", Style: " + playingStyle +
                           ", Matches: " + getMatchesPlayed() + ", Wins: " + getWins() + ", Losses: " + getLosses());
    }
}
