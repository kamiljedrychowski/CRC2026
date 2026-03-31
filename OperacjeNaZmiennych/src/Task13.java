// Task 13: Symulator Logowania
public class Task13 {
    public static boolean login(String user, String pass) {
        String correctUser = "admin";
        String correctPass = "1234";
        return user.equals(correctUser) && pass.equals(correctPass);
    }

    public static void main(String[] args) {
        System.out.println("Logowanie: " + login("admin", "1234"));
    }
}