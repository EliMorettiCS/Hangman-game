
public class Player {
    // Attributes
    private int score;
    private String name;
    private int pronouns; // 1. he/him 2. she/her 3. they/them
    private int ID; // A ID that starts at #001 but goes up every player registered.
    private int wins; // count of every win the player has collected.
    private int losses; // count of every
    private int rounds; // amount of rounds played
    // Constructers

    public Player(String name) {
        this.name = name;
    }
    // Accessors
    public String getWLRatio(){
        return wins/losses+"%";
    }
    public String getName() {
        return name;
    }

    // Mutators
    public void addScore(int points) {
        score += points;
    }
    public void changeName(String i) {
        name = i;
    }
}