// Task 3: Inkrementacja
public class Task3 {
    public static void showIncrementation() {
        int x = 5;
        int y = x++; // y dostaje 5, potem x staje się 6
        int z = ++x; // x staje się 7, potem z dostaje 7
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }

    public static void main(String[] args) {
        showIncrementation();
    }
}