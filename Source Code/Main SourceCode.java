
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

enum Gender {
    MALE("M"),
    FEMALE("F"),
    OTHER("O");

    private String code;

    Gender(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Gender fromCode(String code) {
        for (Gender gender : values()) {
            if (gender.getCode().equalsIgnoreCase(code)) {
                return gender;
            }
        }
        throw new IllegalArgumentException("Invalid gender code: " + code);
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean checkCredentials(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

abstract class Player {
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

class BadmintonSinglesPlayer extends Player {
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

class BadmintonDoublesPlayer extends Player {
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

class BadmintonPlayerManagementSystem {
    private ArrayList<Player> players = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<User> users = new ArrayList<>();
    private User currentUser = null;

    public BadmintonPlayerManagementSystem() {
        users.add(new User("admin", "admin123"));
        users.add(new User("user", "password"));
    }

    public boolean login() {
        System.out.print("LOGIN");
        System.out.print("\nEnter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.checkCredentials(username, password)) {
                currentUser = user;
                return true;
            }
        }
        System.out.println("Invalid credentials. Please try again.");
        return false;
    }

    public void logout() {
        currentUser = null;
        System.out.println("Logged out successfully.");
    }

    public Player findPlayerById(int playerId) {
        for (Player player : players) {
            if (player.getPlayerId() == playerId) {
                return player;
            }
        }
        return null;
    }

    public void addPlayer() {
        if (currentUser == null) {
            System.out.println("Please login first.");
            return;
        }
        System.out.print("\nName: ");
        String name = scanner.nextLine();
        int age = getInputInt("Age: ");
        int rank = getInputInt("Rank: ");
        System.out.print("Country: ");
        String country = scanner.nextLine();
        Gender gender = getGenderInput();

        System.out.print("Player Type (1 for Singles, 2 for Doubles): ");
        Player player = null;
        if (scanner.nextLine().equals("1")) {
            System.out.print("Playing Style (Offensive/Defensive): ");
            player = new BadmintonSinglesPlayer(name, age, rank, country, gender, scanner.nextLine());
        } else {
            System.out.print("Partner's Name: ");
            player = new BadmintonDoublesPlayer(name, age, rank, country, gender, scanner.nextLine());
        }
        players.add(player);
        System.out.println("\nPlayer added with ID: " + player.getPlayerId());
    }

    public void viewPlayers() {
        if (currentUser == null) {
            System.out.println("Please login first.");
            return;
        }
        if (players.isEmpty()) {
            System.out.println("No players found.");
            return;
        }
        for (Player player : players) {
            player.displayInfo();
        }
    }

    public void updatePlayerStats() {
        if (currentUser == null) {
            System.out.println("Please login first.");
            return;
        }
        System.out.print("Enter Player ID to update: ");
        int playerId = getInputInt("");
        Player player = findPlayerById(playerId);
        if (player != null) {
            System.out.print("Did the player win the match? (yes/no): ");
            boolean win = scanner.nextLine().equalsIgnoreCase("yes");
            player.updateMatchStats(win);
            System.out.println("Match stats updated for Player ID: " + playerId);
        } else {
            System.out.println("Player not found.");
        }
    }

    public void searchPlayers() {
        if (currentUser == null) {
            System.out.println("Please login first.");
            return;
        }
        System.out.print("Enter Player Name to search: ");
        String name = scanner.nextLine();
        players.stream().filter(player -> player.getName().equalsIgnoreCase(name))
                .forEach(Player::displayInfo);
    }

    public void showTopPlayers() {
        if (currentUser == null) {
            System.out.println("Please login first.");
            return;
        }
        players.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getRank(), p1.getRank()))
                .limit(5)
                .forEach(Player::displayInfo);
    }

    public void showGenderStatistics() {
        if (currentUser == null) {
            System.out.println("Please login first.");
            return;
        }
        Map<Gender, Long> genderCount = new HashMap<>();
        for (Player player : players) {
            Gender gender = player.getGender();
            genderCount.put(gender, genderCount.getOrDefault(gender, 0L) + 1);
        }
        genderCount.forEach((gender, count) -> 
            System.out.println(gender.name() + ": " + count)
        );
    }

    private int getInputInt(String prompt) {
        int value;
        while (true) {
            try {
                System.out.print(prompt);
                value = Integer.parseInt(scanner.nextLine());
                if (value > 0) break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
        return value;
    }

    private Gender getGenderInput() {
        String gender;
        while (true) {
            System.out.print("Gender (Male/Female/O - Other): ");
            gender = scanner.nextLine().toUpperCase();
            try {
                return Gender.fromCode(gender);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter 'M', 'F', or 'O'.");
            }
        }
    }

    public void displayMenu() {
        System.out.println("\nWelcome to the Badminton Players Management System");
        System.out.println("1. Add a Player");
        System.out.println("2. View All Players");
        System.out.println("3. Update Player Stats");
        System.out.println("4. Search Players");
        System.out.println("5. Show Top Players by Rank");
        System.out.println("6. Show Gender Stats");
        System.out.println("7. Logout");
        System.out.print("Enter your choice number: ");
    }

    public void run() {
        if (!login()) {
            System.out.println("Login failed. Exiting system.");
            return;
        }
        while (true) {
            displayMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addPlayer();
                    break;
                case "2":
                    viewPlayers();
                    break;
                case "3":
                    updatePlayerStats();
                    break;
                case "4":
                    searchPlayers();
                    break;
                case "5":
                    showTopPlayers();
                    break;
                case "6":
                    showGenderStatistics();
                    break;
                case "7":
                    logout();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new BadmintonPlayerManagementSystem().run();
    }
}
