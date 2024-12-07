public class BadmintonDoublesPlayer extends Player {
    private String partnerName;

    public BadmintonDoublesPlayer(String name, int age, int rank, String country, Gender gender, String partnerName) {
        super(name, age, rank, country, gender);
        this.partnerName = partnerName;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getPlayerId() + ", Name: " + getName() + " (Doubles), Rank: " + getRank() + ", Partner: " + partnerName +
                           ", Matches: " + getMatchesPlayed() + ", Wins: " + getWins() + ", Losses: " + getLosses());
    }
}
