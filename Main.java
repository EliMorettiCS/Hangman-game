import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Can You Please Give A Name? (0-20 Characters)");
        input = myObj.nextLine();
        Settings Settings1 = new Settings();
        Player Player1 = new Player(input);
        System.out.println("Hello "+Player1.getName()+". Welcome to Hangman! We have a Story mode, and a Endless Mode. Which one would you like to play?");
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
                        if (Settings1.getStyleSetting() == true) {
                            System.out.println("Your Text Styling Is Currently Set To On. Turn it off? (y/n)");
                            input = myObj.nextLine();
                            if (input == "y") {
                                Settings1.toggleStyleSetting();
                            }
                        }
                        else {
                            System.out.println("Your Text Styling Is Currently Set To Off. Turn it on? (y/n)");
                            input = myObj.nextLine();
                            if (input == "y") {
                                Settings1.toggleStyleSetting();
                            }
                        }
                    }
                    if (input.equals("2")) {
                        
                    }
                    if (input.equals("3")) {
                        
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
                if (input == "y") {
                    System.exit(0);
                }
            }
        }
    }
}