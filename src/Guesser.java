// Importing scanner so that I can recieve user input
import java.util.Scanner;

// This allows the user the guess, and evaluates the guess and gives feedback
public class Guesser {
    Scanner scanner = new Scanner(System.in);
    private int guess;
    private int guess_count = 0;
    private boolean is_correct = false;

    public Guesser() {}

    public void ReceiveGuess() {
        System.out.print("What's your guess: ");
        this.guess = scanner.nextInt();
        guess_count += 1;
    }

    public boolean GuessEvaluator(int random_number) {
        if(this.guess > random_number) {
            System.out.print("Too high!");
            System.out.println();
        }
        else if(this.guess < random_number) {
            System.out.print("Too low!");
            System.out.println();
        }
        else {
            System.out.println("You are correct!");
            is_correct = true;
        }
        return is_correct;
    }
    
    // This keeps track of the number of guesses
    public int GuessCountChecker() {
        return this.guess_count;
    }
}