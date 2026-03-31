// Task 2: Sekundy na Czas
public class Task2 {
    public static void formatTime(int totalSeconds) {
        int h = totalSeconds / 3600;
        int m = (totalSeconds % 3600) / 60;
        int s = totalSeconds % 60;
        System.out.println(totalSeconds + " s = " + h + "h " + m + "min " + s + "s");
    }

    public static void main(String[] args) {
        formatTime(3665);
    }
}