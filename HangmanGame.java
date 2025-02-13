import java.util.Scanner;

public class HangmanGame
{
    Scanner myObj = new Scanner(System.in);
    // Attributes
    String word;
    String modifiedword;
    int wrongGuesses;
    int correctGuesses;
    String pickedLetters = "";
    String input;
    String buildWord = "_";;
    // Constructers
    public HangmanGame(String customWord) {
        if (customWord.equals("")) { // Made for endless mode.
        this.word = WordProvider.getWord().toUpperCase();
        }

        else { // Made For Storymode
            System.out.println("(Keep in mind the word is pregenerated.)");
        }

        for (int i = 0; i <= this.word.length()-1; i++) {
            buildWord+=" _";
        }

        System.out.println(buildWord);
        this.word = this.word.toUpperCase();
        this.modifiedword = this.word;
        System.out.println("Alright, Pick a letter from your keyboard to guess."); // Game Start
        System.out.println("Word: "+this.word);
        while (wrongGuesses <= 6) {
            System.out.println(buildWord);
            input = myObj.nextLine();
            input = input.toUpperCase();
            if (input.length() == 1) {
                if (pickedLetters.indexOf(input) == -1) {
                    pickedLetters += input;
                    if (modifiedword.indexOf(input) != -1) {
                        int timesrun = 0;
                        for (int i = 0; i != 1;) {
                            if (modifiedword.indexOf(input) != -1) {
                                correctGuesses++;
                                this.modifiedword = this.modifiedword.substring(0,this.modifiedword.indexOf(input))+this.modifiedword.substring(this.modifiedword.indexOf(input)+1);
                                timesrun++;
                            }
                            else {
                                if (timesrun == 1) {
                                    System.out.println("Correct! There was "+input+" in that word "+timesrun+" time!");
                                }
                                else {
                                    System.out.println("Correct! There was "+input+" in that word "+timesrun+" times!");
                                }
                                System.out.println("Modified Word:"+this.modifiedword);
                                System.out.println("Word: "+this.word);
                                i++;
                            }
                        }
                    }
                    else {
                        wrongGuesses++;
                        System.out.println("Wrong Guess!");
                    }
                }
                else {
                    System.out.println("You've already picked that letter.");
                }
            }
            else {
                System.out.println("One Letter Response Only Please.");
            }
        }
    }

    // Accessors

    // Mutators
}