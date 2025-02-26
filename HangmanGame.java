import java.util.Scanner;

public class HangmanGame
{
    Scanner myObj = new Scanner(System.in);
    // Attributes
    String word;
    String modifiedword;
    int wrongGuesses;
    int correctGuesses;
    String pickedLetters = "{::}";
    String input;
    String buildWord = "_";;
    // Constructers
    public HangmanGame() {
    }
    public boolean startGame(String customWord) {
        if (customWord.equals("")) { // Made for endless mode.
        word = WordProvider.getWord().toUpperCase();
        }

        else { // Made For Storymode
            System.out.println("(Keep in mind the word is pregenerated.)");
        }

        for (int i = 0; i <= word.length()-2; i++) {
            buildWord+="_";
        }

        System.out.println(buildWord);
        word = word.toUpperCase();
        modifiedword = word;
        System.out.println("Alright, Pick a letter from your keyboard to guess."); // Game Start
        while (wrongGuesses <= 5) {
            System.out.println(buildWord);
            System.out.println("Picked Letters:"+pickedLetters);
            input = myObj.nextLine();
            input = input.toUpperCase();
            if (input.length() == 1) {
                if (pickedLetters.indexOf(input) == -1) {
                    pickedLetters = pickedLetters.substring(0,pickedLetters.length()-2)+input+" "+pickedLetters.substring(pickedLetters.length()-2,pickedLetters.length());
                    if (modifiedword.indexOf(input) != -1) {
                        int timesrun = 0;
                        for (int i = 0; i != 1;) {
                            if (modifiedword.indexOf(input) != -1) {
                                correctGuesses++;
                                buildWord = buildWord.substring(0,modifiedword.indexOf(input))+input+buildWord.substring(modifiedword.indexOf(input)+1);  
                                modifiedword = modifiedword.substring(0,modifiedword.indexOf(input))+"_"+modifiedword.substring(modifiedword.indexOf(input)+1);
                                timesrun++;                           
                            }
                            else {
                                if (timesrun == 1) {
                                    System.out.println("Correct! There was "+input+" in that word "+timesrun+" time!");
                                }
                                else {
                                    System.out.println("Correct! There was "+input+" in that word "+timesrun+" times!");
                                }
                                i++;
                            }
                            if (buildWord.equals(word)) {
                                System.out.println("You won!");
                                return true;
                            }
                            if (wrongGuesses == 6) {
                                System.out.println("You lost!");
                                return false;
                            }
                        }
                    }
                    else if (wrongGuesses != 5){
                        wrongGuesses++;
                        System.out.println("Wrong Guess! You have "+(6-wrongGuesses)+" Guesses left");
                    }
                    else {
                        wrongGuesses++;
                    }
                }
                else {
                    System.out.println("You've already picked that letter.");
                }
            }
            else {
                System.out.println(("One Letter Response Only Please."));
            }
        }
        return false;
    }

    // Accessors

    // Mutators
}