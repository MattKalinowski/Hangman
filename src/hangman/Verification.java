package hangman;

import static hangman.Game.counter;
import static hangman.Game.encrypt;
import static hangman.Game.letters;
import static hangman.Game.miss;
import static hangman.Game.missed;
import static hangman.Game.misses;

public class Verification {
    
    public static char[] letters(char c) {     
        
        missed = true;
        for(int i=0; i<letters.length; i++) {
            if (c == letters[i]) {
                missed = false;
            }
            if (c == letters[i] && c != encrypt[i]) {
                encrypt[i] = c;
                counter++; 
        }
        }   
        return encrypt;
    }
    
    public static void misses(char c) { 
        
        missesCheck(c);
        if (missed) {
            misses[miss] = c;
            miss++;
        }
        
        for(int i = 0; i < misses.length; i++) {
            
            if (miss == 0) {
                misses[i] = '\u0000';
            }
            if (miss == 1 && missed) {
                misses[i] = '\u0000';
                misses[0] = c;
            }
            if (misses[i] == '\u0000') {
                misses[i] = ' ';
            }
        }      
    }
    
    public static char[] missesPrint() {       
        return misses;
    }
    
    private static void missesCheck(char c) {
        for (int i = 0; i < misses.length; i++) {
            if (c == misses[i]) {
                missed = false;
            }
        }
    }
}
