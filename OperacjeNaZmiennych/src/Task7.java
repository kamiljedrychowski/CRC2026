// Task 7: Dni Tygodnia
public class Task7 {
    public static String getDayName(int day) {
        return switch (day) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6, 7 -> "Weekend";
            default -> "Błąd";
        };
    }

    public static void main(String[] args) {
        System.out.println(getDayName(5));
    }
}