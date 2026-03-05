// These let me read user input and also read text from a file
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

// This reads the score file and returns the current high score
public class Reader {

    public Reader() {}

    public String ReadScore() throws FileNotFoundException {
        File file = new File("score.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        scanner.close();
        return line;
    }
}