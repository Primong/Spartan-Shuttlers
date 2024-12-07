public abstract class Player {
    private static int nextPlayerId = 1;
    private int playerId;
    private String name, country;
    private int age, rank;
    private Gender gender;
    private int matchesPlayed;
    private int wins;
    private int losses;

    public Player(String name, int age, int rank, String country, Gender gender) {
        this.playerId = nextPlayerId++;
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.country = country;
        this.gender = gender;
        this.matchesPlayed = 0;
        this.wins = 0;
        this.losses = 0;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public Gender getGender() {
        return gender;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public void updateMatchStats(boolean win) {
        this.matchesPlayed++;
        if (win) {
            this.wins++;
        } else {
            this.losses++;
        }
    }

    public abstract void displayInfo();

    @Override
    public String toString() {
        return "ID: " + playerId + ", Name: " + name + ", Age: " + age + ", Rank: " + rank + ", Country: " + country + ", Gender: " + gender + 
               ", Matches: " + matchesPlayed + ", Wins: " + wins + ", Losses: " + losses;
    }
}
