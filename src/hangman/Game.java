package hangman;
import java.util.Scanner;

public class Game {

    static String word;
    static char[] encrypt;
    static char[] letters;
    static char[] misses = new char[10];
    static int counter;
    static int miss;
    static boolean missed;
    static boolean game = true;
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);     
       
        while (game) {            
            newGame();
            while (counter < letters.length && miss < 10) {
                System.out.print("Guess: ");
                String s = input.nextLine();
                char c = s.charAt(0);                
                gameplay(c);
            }
            gameEnd();
        }
    }
    
    public static void newGame() {
        Repository.setTopic(chooseTopic());
        word = Repository.randomWord();
        encrypt = word.toCharArray();
        letters = word.toCharArray();
        counter = 0;
        miss = 0;
        drawLine();
        System.out.print("Word: ");
        System.out.println(Encryption.encrypt());
        System.out.print("\nMisses: \n\n");
    }
    
    public static void gameplay(char c){
        drawLine();
        System.out.print("Word: ");
        System.out.println(Verification.letters(c));
        Verification.misses(c);
        System.out.print("\nMisses: ");
        System.out.println(Verification.missesPrint());
        System.out.println();
    }
    
    public static int chooseTopic() {
        System.out.println("1. Cities\n"
                         + "2. Movies\n"
                         + "3. Animals\n"
                         + "4. Music\n"
                         + "5. Food\n"
                         + "6. Hard words\n");
        
        System.out.print("Choose your topic: ");
        Scanner input = new Scanner(System.in);  
        int choice = input.nextInt();
        return choice;
    }
    
    public static void gameEnd() {
        if (miss == 10) {
            System.out.print("You loose. The word was: ");
            System.out.print(letters);
            System.out.println();
        }

        if (counter == letters.length) {
            System.out.println("You got it!");
        }

        System.out.println("Press any key to begin a new game or press \"q\" quit.");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        if (choice.matches("q")) {
            game = false; 
        }
    }
    
    private static void drawLine() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-\n");
    }
}
