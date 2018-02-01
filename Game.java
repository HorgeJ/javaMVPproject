public class Game {
    private String answer;
    private String hits;
    private String misses;  

    public Game(String answer){     //Answer object constructer, accepts an answer arg
        this.answer = answer;       // Ous objects answer var == passed in answer var
        hits = "";                  // Intialize hits string to empty
        misses = "";                // Initialize misses string to empty
    }

    public boolean applyGuess(char letter){
        boolean isHit = answer.indexOf(letter) != -1;   // is our supplied char a shit (greater than 1)
        if(isHit){                                      // if our letter IS a hit 
            hits += letter;                             // concatinate our letter to our hit String obj.
        } else {                                        // if not a hit
            misses += letter;                           // concatinate miss to misses String
        }
        return isHit;                                   // return true if found else ret false
    }

    public String getCurrentProgress(){
        String progress = "";                           // temp string to add to
        
        for(char letter : answer.toCharArray()){
            char display = '-';
            if(hits.indexOf(letter) != -1){
                display = letter;
            }
            progress += display;                        // add HIT letters to our temp string
        }
        return progress;
    }

}