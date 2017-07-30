package hangman;

import java.util.Random;

public class Repository {
    
    static String word = null;
    
    static String[] cities = {   "C a i r o", 
                                 "A s p e n", 
                                 "B e i j i n g"};
    
    static String[] movies = {   "D j a n g o", 
                                 "M a t r i x", 
                                 "S c a r f a c e"};
    
    static String[] animals = {  "e l e p h a n t", 
                                 "a p e", 
                                 "r a c c o o n"};
    
    static String[] music = {    "B e e t h o v e n", 
                                 "B l a c k  S a b b a t h", 
                                 "Q u e e n"};
    
    static String[] food = {     "w a t e r m e l l o n", 
                                 "b a n a n a", 
                                 "c h e e s e b u r g e r"};
    
    static String[] hardWords = { "j a z z", 
                                  "d i z z y", 
                                  "b u z z e d"};
    
    
    public static void setTopic(int t) {
       
        switch (t) {
            case 1:
                word = cities[new Random().nextInt(cities.length)];
                break;
            case 2:
                word = movies[new Random().nextInt(movies.length)];
                break;
            case 3:
                word = animals[new Random().nextInt(animals.length)];
                break;
            case 4:
                word = music[new Random().nextInt(music.length)];
                break;
            case 5:
                word = food[new Random().nextInt(food.length)];
                break;
            case 6:
                word = hardWords[new Random().nextInt(hardWords.length)];
                break;
            default:
                System.out.println("Error - incorrect value.");
                break;
        }
    }
    
    public static String randomWord() { 
        return word;
    }
}
