package ss2_OOP.Exercise2;

public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction();
        Fraction fraction1 = new Fraction();

        System.out.println("Nhập phân số thứ nhất: ");
        fraction.input();

        System.out.println("Nhập phân số thứ hai: ");
        fraction1.input();

        System.out.println("Phân số thứ nhất: ");
        fraction.ouput();

        System.out.println("Phân số thứ hai: ");
        fraction1.ouput();

        fraction.calSum(fraction1);
    }
}
