// Task 12: Przycinanie i Zamiana
public class Task12 {
    public static String fixString(String input) {
        return input.trim().replace("Pythonie", "Javie");
    }

    public static void main(String[] args) {
        System.out.println(fixString("  Lubię programować w Pythonie  "));
    }
}