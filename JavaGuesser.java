import java.util.Scanner;

public class JavaGuesser {
    
    public static void guessTheNum() {

        Scanner sc = new Scanner(System.in);
        // generate secret number 
        int secretNum = 1 + (int)(Math.random() * ((99 - 1) + 1));
        int tries = 7;
        int guesses, guessedNum;

        // get player name 
        System.out.println("Hello, what is your name?");
        String playerName = sc.next();

        // start the game
        System.out.println("I'm thinking of a number between 1 and 99\nYou have 7 tries.");
        for (guesses = 0; guesses < tries; guesses++) 
        {
            System.out.println("Guess a number: ");
            // user input 
            guessedNum = sc.nextInt();

            // check the input 
            if (guessedNum == secretNum)
            {
                System.out.println("Congrats " + playerName + " you guessed it!\nIt took you " + (guesses+1) + " guesses");
                break;
            }
            else if (guessedNum > secretNum && guesses != tries - 1)
            {
                System.out.println("Your guess is too high!");
            }
            else if (guessedNum < secretNum && guesses != tries - 1)
            {
                System.out.println("Your guess is too low!");     
            }
        }
        if (guesses == tries)
        {
            System.out.println("Sorry " + playerName + ", you lost. The number I was thinking of was " + secretNum);
        }
       
        
    }
    public static void main(String arg[])
    {
        guessTheNum();
    }
}