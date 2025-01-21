
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
        this.wins = 2;
        this.losses = 3;
    }
    // Accessors
    public int getWins() {
        return this.wins;
    }
    public int getLosses() {
        return this.losses;
    }
    public double getWLRatio(){
        return this.wins/this.losses;
    }
    public String getName() {
        return this.name;
    }
    public int getpronounsint() {
        return this.pronouns;
    }
    public String getpronounsString() {
        if (this.pronouns == 1) {
            return "he/him";
        }
        if (this.pronouns == 2) {
            return "she/her";
        }
        if (this.pronouns == 3) {
            return "they/them";
        }
        else {
            return "Man I have no idea";
        }
    }
    public String getpronoun(int x) {
        if (this.pronouns == 1) {
            if (x == 1) {
                return "he";
            }
            else {
                return "him";
            }        
        }
        if (this.pronouns == 2) {
            if (x == 1) {
                return "she";
            }
            else {
                return "her";
            }        
        }
        if (this.pronouns == 3) {
            if (x == 1) {
                return "they";
            }
            else {
                return "them";
            }        
        }
        else {
            return "error";
        }
    }
    // Mutators
    public void addScore(int points) {
        this.score += points;
    }
    public void changeName(String i) {
        this.name = i;
    }

    public void changePronouns(int miku) {
        this.pronouns = miku;
    }
}