public class Hangman{
    public static void main(String[] args){
        Game game = new Game("treehouse");          // Creating a new instance of our Game class called Game with answer passed in
        Prompter prompter = new Prompter(game);         // to use prompter with oyur game passed in

        while(game.getRemainingTries() > 0 ){       // while you still have tries left, keep playing
            prompter.displayProgress();
            prompter.promptForGuess(); 
        }
    }
}