// Task 11: Porównywanie Stringów
public class Task11 {
    public static void compare() {
        String a = "Java";
        String b = new String("Java");
        System.out.println("== : " + (a == b));
        System.out.println(".equals() : " + a.equals(b));
    }

    public static void main(String[] args) {
        compare();
    }
}