import java.util.Scanner;

public class JavaGuesser {
    
    public static void guessTheNum() {

        Scanner sc = new Scanner(System.in);
        // generate secret number 
        int secretNum = 1 + (int)(Math.random() * ((99 - 1) + 1));
        int tries = 7;
        int guess;

        // get player name 
        System.out.println("Hello, what is your name?");
        String playerName = sc.next();

        // start the game
        System.out.println("I'm thinking of a number between 1 and 99\nYou have 7 tries.");
        for (int i = 0; i < tries; i++) 
        {
            System.out.println("Guess a number: ");
            // user input 
            guess = sc.nextInt();

            // check the input 
            if (guess == secretNum)
            {
                System.out.println("Congrats " + playerName + " you guessed it!");
                break;
            }
            else if (guess > secretNum && i != tries - 1)
            {
                System.out.println("Your guess is too high!");

            }
            else if (guess < secretNum && i != tries - 1)
            {
                System.out.println("Your guess is too low!");
                
            }
        }
    }
    public static void main(String arg[])
    {
        guessTheNum();
    }
}