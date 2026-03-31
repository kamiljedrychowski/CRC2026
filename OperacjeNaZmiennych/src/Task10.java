// Task 10: Generator Losowy
import java.util.Random;

public class Task10 {
    public static void checkRandom() {
        int randomNum = new Random().nextInt(100) + 1;
        String type = (randomNum % 2 == 0) ? "Parzysta" : "Nieparzysta";
        System.out.println("Wylosowano " + randomNum + " (" + type + ")");
    }

    public static void main(String[] args) {
        checkRandom();
    }
}