// Task 4: BMI Calculator
public class Task4 {
    public static double calculateBMI(double weight, double height) {
        return weight / Math.pow(height, 2);
    }

    public static void main(String[] args) {
        System.out.printf("BMI: %.2f%n", calculateBMI(70, 1.75));
    }
}