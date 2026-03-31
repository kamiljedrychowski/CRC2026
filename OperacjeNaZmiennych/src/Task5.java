// Task 5: Walidator Hasła
public class Task5 {
    public static boolean validatePassword(String password) {
        return password != null && password.length() >= 8;
    }

    public static void main(String[] args) {
        System.out.println("Czy '123' poprawne? " + validatePassword("123"));
        System.out.println("Czy 'tajneHaslo123' poprawne? " + validatePassword("tajneHaslo123"));
    }
}