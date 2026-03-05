import java.io.FileNotFoundException;

// This is the main class. It integreates the Guesser, RandomNumberGenerator, Reader, and Writer classes
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        RandomNumberGenerator rng = new RandomNumberGenerator(1,100);
        Guesser gsr = new Guesser();
        boolean is_correct = false;

        // A random number is generator, guesses are received and evaluated and feedback is given until guessed
        int random_number = rng.GenerateNumber();

        while (is_correct == false) {
            gsr.ReceiveGuess();
            is_correct = gsr.GuessEvaluator(random_number);
        }

        // This displays the amount of guesses taken to find the random number, if it took lower guesses than the current record, the new record is stated. If not the same current record is stated
        int guess_count = gsr.GuessCountChecker();
        System.out.printf("You guessed a total of %d times!%n", guess_count);
        Reader reader = new Reader();
        String record = reader.ReadScore();
        int record_int = Integer.parseInt(record);
        if (guess_count < record_int) { 
            Writer writer = new Writer();
            writer.WriteScore(guess_count);
            System.out.printf("Your new record is %d!%n", guess_count);
        }
        else {
            System.out.printf("Your record is still %d!%n", record_int);
        }
    }
}