package ss3_static.Exercise3;

import java.util.Scanner;

public class MathUtil {
    double a;
    double b;

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        a = scanner.nextDouble();

        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
    }
}
