import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        Scanner myObj = new Scanner(System.in);
        System.out.println("I planned on adding more features but deadlines got in the way so speech styling, style setting and story doesnt do anything. pronouns have a system in place but arent actually implemented. PS: type: APCSA2025 into main menu to turn on/off dev mode");
        System.out.println("Can You Please Give A Name? (0-20 Characters)");
        input = myObj.nextLine();
        Settings Settings1 = new Settings();
        Player player1 = new Player(input);
        System.out.println("Yo im gonna need some pronouns also");
        System.out.println("(1) he/him");
        System.out.println("(2) she/her");
        System.out.println("(3) they/them");
        input = myObj.nextLine();
        player1.changePronouns(Integer.parseInt(input));
        input = "";
        System.out.println("Hello "+player1.getName()+". Welcome to Hangman! We have a Story mode, and a Endless Mode. Which one would you like to play?");
        while (true) {
            System.out.println("(1) Story Mode");
            System.out.println("(2) Endless Mode");
            System.out.println("(3) Settings");
            System.out.println("(4) End");
            input = myObj.nextLine();
            if (input.equals("1")) {
                System.out.println("Starting Story Mode...");
            }
            if (input.equals("2")) {
                System.out.println("Starting Endless Mode...");
                HangmanGame Game1 = new HangmanGame(player1);
                if (Game1.startGame("") == true) {
                    player1.addWin();
                }
                else {
                    player1.addLoss();
                }
                
            }
            if (input.equals("3")) {
                System.out.println("Booting Up Settings...");
                while (true)
                {
                    System.out.println("What setting would you like to change?");
                    System.out.println("(1) Style Setting");
                    System.out.println("(2) Speech Setting");
                    System.out.println("(3) Player Settings");
                    System.out.println("(4) Exit Settings");
                    input = myObj.nextLine();
                    if (input.equals("1")) {
                        if (Settings1.getStyleSetting()) {
                            System.out.println("Your Text Styling Is Currently Set To On. Turn it off? (y/n)");
                            input = myObj.nextLine();
                            if (input.equals("y")) {
                                Settings1.toggleStyleSetting();
                            }
                        }
                        else {
                            System.out.println("Your Text Styling Is Currently Set To Off. Turn it on? (y/n)");
                            input = myObj.nextLine();
                            if (input.equals("y")) {
                                Settings1.toggleStyleSetting();
                            }
                        }
                    }
                    if (input.equals("2")) {
                        if (Settings1.getSpeechSetting()) {
                            System.out.println("Your Text Speech Is Currently Set To On. Turn it off? (y/n)");
                            input = myObj.nextLine();
                            if (input.equals("y")) {
                                Settings1.toggleSpeechSetting();
                            }
                        }
                        else {
                            System.out.println("Your Speech Styling Is Currently Set To Off. Turn it on? (y/n)");
                            input = myObj.nextLine();
                            if (input.equals("y")) {
                                Settings1.toggleSpeechSetting();
                            }
                        }
                    }
                    if (input.equals("3")) {
                        System.out.println("What Player Setting would you like to change?");
                        System.out.println("(1) I would like to change my name.");
                        System.out.println("(2) I would like to change my pronouns");
                        System.out.println("(3) I would like to check my wins/losses");
                        input = myObj.nextLine();
                        if (input.equals("1")) {
                            System.out.println("Your Current Name is "+player1.getName()+". What would you like to change it to?");
                            input = myObj.nextLine();
                            player1.changeName(input);
                        }
                        if (input.equals("2")) {
                            System.out.println("Your Current Pronouns are "+player1.getpronounsString()+". What would you like to change it to?");
                            System.out.println("(1) he/him");
                            System.out.println("(2) she/her");
                            System.out.println("(3) they/them");
                            input = myObj.nextLine();
                            player1.changeName(input);
                            if (input.equals("1")) {
                                player1.changePronouns(1);
                                System.out.println("You go! Slay King!");
                                input = "";
                            }
                            if (input.equals("2")) {
                                player1.changePronouns(2);
                                System.out.println("You go! Slay Queen!");
                                input = "";
                            }
                            if (input.equals("3")) {
                                player1.changePronouns(3);
                                System.out.println("You go! Slay!");
                                input = "";
                            }
                            else {
                                System.out.println("Sorry those are the only three we got. We outta stock");
                            }
                        }
                        if (input.equals("3")) {
                            System.out.println("Okie Dokie Artichokie!");
                            System.out.println("You have"+player1.getWins()+" Wins.");
                            System.out.println("You have"+player1.getLosses()+" Losses.");
                            System.out.println("You have a W/L Ratio Of "+player1.getWLRatio()+"%.");
                            input = "";
                        }
                    }
                    if (input.equals("4")) {
                        input = "";
                        break;
                    }
                }
            }
            if (input.equals("4")) {
                System.out.println("Are you sure you would like to exit? Progress will not be saved. (y/n)");
                input = myObj.nextLine();
                if (input.equals("y")) {
                    System.exit(0);
                }
                input = "";
            }
            if (input.equals("APCSA2025")) {
                player1.toggleDevMode();
                if (player1.getDevMode()) {
                    System.out.println("Developer Mode Activated");

                }
                else {
                    System.out.println("Developer Mode Deactivated");
                }
            }
        }
    }
}