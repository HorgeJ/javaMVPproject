public class Hangman{
    public static void main(String[] args){
        Game game = new Game("treehouse");          // Creating a new instance of our Game class called Game with answer passed in
        Prompter prompter = new Prompter(game);         // to use prompter with oyur game passed in

        boolean isHit = prompter.promptForGuess();

        if(isHit){
            System.out.println("We got a Hit!");
        } else {
            System.out.println("Oops missed");
        }
    }
}