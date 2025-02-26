
public class Player {
    // Attributes
    private int score;
    private String name;
    private int pronouns; // 1. he/him 2. she/her 3. they/them
    private int ID; // A ID that starts at #001 but goes up every player registered.
    private int wins; // count of every win the player has collected.
    private int losses; // count of every
    private int rounds; // amount of rounds played
    private boolean devMode = false;
    // Constructers

    public Player(String name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
    }
    // Accessors
    public int getWins() {
        return this.wins;
    }
    public int getLosses() {
        return this.losses;
    }
    public double getWLRatio(){
        return Math.round(100 * this.wins / this.losses);
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
    public boolean getDevMode() {
            if (devMode = true) {
                return true;
            }
            else {
                return false;
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

    public String addStyling(String text) {
        return ("{: "+text+":}");
    }
    public void addWin() {
        this.wins++;
    }
    public void addLoss() {
        this.losses++;
    }

    public void toggleDevMode() {
        if (devMode == true ) {
            devMode = false;
        }
        else if (devMode == false ) {
            devMode = true;
        }
    }

}