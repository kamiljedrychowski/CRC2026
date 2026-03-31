// Task 6: Kalkulator Podatkowy
public class Task6 {
    public static double calculateTax(double income) {
        if (income <= 85528) {
            return income * 0.17;
        } else {
            return (85528 * 0.17) + ((income - 85528) * 0.32);
        }
    }

    public static void main(String[] args) {
        System.out.println("Podatek od 100k: " + calculateTax(100000));
    }
}