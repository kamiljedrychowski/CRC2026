// Task 1: Konwerter Temperatur
public class Task1 {
    public static void convertCelsius(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;
        System.out.printf("%.2f C = %.2f F oraz %.2f K%n", celsius, fahrenheit, kelvin);
    }

    public static void main(String[] args) {
        convertCelsius(25.0);
    }
}