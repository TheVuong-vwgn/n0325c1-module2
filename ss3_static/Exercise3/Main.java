package ss3_static.Exercise3;

public class Main {
    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();
        mathUtil.input();

        double sum = MathUtil.add(mathUtil.a, mathUtil.b);
        double difference = MathUtil.subtract(mathUtil.a, mathUtil.b);
        double product = MathUtil.multiply(mathUtil.a, mathUtil.b);
        double qoutient = MathUtil.divide(mathUtil.a, mathUtil.b);

        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        System.out.println("Thương: " + qoutient);
    }
}
