// This lets me use Random, which generates random numbers within certian paramters
import java.util.Random;

// RandomNumberGenerator class is created with fields, random_number, max, and min, and methods GenerateNumber and
public class RandomNumberGenerator {
    private int max;
    private int min;

    public RandomNumberGenerator(int min_number, int max_number) {
        this.max = max_number;
        this.min = min_number;
    }

    public int GenerateNumber() {
        Random random = new Random();
        int random_number = random.nextInt(this.max - this.min + 1) + this.min;
        return random_number;
    }
}