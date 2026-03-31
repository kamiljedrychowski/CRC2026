// Task 15: Kalkulator Zniżek
public class Task15 {
    public static void printDiscountedPrice(double price, int age) {
        double discount = 0;
        if (age < 18) discount = 0.2;
        else if (age > 65) discount = 0.3;

        double finalPrice = price * (1 - discount);
        System.out.printf("Cena dla wieku %d: %.2f zł%n", age, finalPrice);
    }

    public static void main(String[] args) {
        printDiscountedPrice(100, 70);
    }
}