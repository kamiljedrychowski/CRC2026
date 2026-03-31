// Task 8: Rok Przestępny
public class Task8 {
    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println("2024: " + isLeap(2024));
    }
}