// This allows me to to write to a file and throws an exception if the file isn't found
import java.io.PrintWriter;
import java.io.FileNotFoundException;

// This will write to a the high score file using the guess count file (if it's a better score)
public class Writer {

    public Writer () {}

    public void WriteScore (int guess_count) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("score.txt");
        pw.println(guess_count);
        pw.close();
    }
}