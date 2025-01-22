import java.util.Scanner;

public class HangmanGame
{
    Scanner myObj = new Scanner(System.in);
    // Attributes
    String word;
    String wrongGuesses;
    String correctGuesses;
    String pickedLetters;
    String input;
    // Constructers
    public HangmanGame(String customWord) {
        if (customWord.equals("")) { // Made for endless mode.
        this.word = WordProvider.getWord();
        }

        else { // Made For Storymode
            System.out.println("(Keep in mind the word is pregenerated.)");
        }
        System.out.println("Alright, Pick a letter from your keyboard to guess.");
        input = myObj.nextLine();
    }

    // Accessors

    // Mutators
}