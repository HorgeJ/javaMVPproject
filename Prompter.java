
import java.util.Scanner; // lets us take in imput

public class Prompter {
    //Front end portion of app
    
    private Game game;          // Letting the propter class know about our Game class

    public Prompter(Game game){     // Constructor that refrences our game 
        this.game = game;           // set our private Game = to the game parameter passed in
    }

    public boolean promptForGuess(){    //Will prompt for guess and determine if it was correct
        Scanner scanner = new Scanner(System.in);       // new instance of scanner for us to use
        System.out.print("Enter a letter:  ");          // prompt for input
        String guessInput = scanner.nextLine();
        char guess = guessInput.charAt(0);              // take char at position 0
        return game.applyGuess(guess);                  // sending our char to the game class and invoking applyGuess function on guess char
    }

    public void displayProgress(){
        System.out.printf("Try to solve :  %s%n", game.getCurrentProgress());      // accessing getCurrentProgress method in Hangman
    }
    
}