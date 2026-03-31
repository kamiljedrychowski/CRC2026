// Task 9: Zabawy z Tekstem
public class Task9 {
    public static void processName(String fullName) {
        System.out.println("Upper: " + fullName.toUpperCase());
        int space = fullName.indexOf(" ");
        System.out.println("Nazwisko: " + fullName.substring(space + 1));
        System.out.println("Czy -ski? " + fullName.endsWith("ski"));
    }

    public static void main(String[] args) {
        processName("Piotr Kowalski");
    }
}