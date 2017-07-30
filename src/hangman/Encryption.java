package hangman;

import static hangman.Game.counter;
import static hangman.Game.encrypt;
import static hangman.Game.letters;

public class Encryption {
    
    public static char[] encrypt() { 
       
        for(int i = 0; i < encrypt.length; i++) {
            
            if(letters[i] == encrypt[i] && letters[i] != ' ') {
                encrypt[i] = '_';
                  
            } else if(letters[i] == encrypt[i] && letters[i] == ' ') {
                counter++;
        }
        }
        return encrypt;
    }
}
