package ss2_OOP.Exercise2;

import java.util.Scanner;

public class Fraction {
    double numerator;
    double denominator;

    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tử số: ");
        numerator = scanner.nextDouble();

        do {
            System.out.print("Nhập vào mẫu số: ");
            denominator = scanner.nextDouble();

            if (denominator == 0) {
                System.out.println("Nhập mẫu số lớn hơn 0, vui lòng kiểm tra lại!!!");
            }
        } while (denominator == 0);
    }

    double USCLN(double tuso, double mauso) {
        if (tuso == 0 || mauso == 0) {
            return 1;
        }

        tuso = Math.abs(tuso);

        for (double i = numerator; i >= 1; i--) {
            if (numerator % i == 0 && denominator % i ==0) {
                return i;
            }
        }
        return 1;
    }

    void simplify() {
        double uscln = USCLN(numerator, denominator);
        numerator /= uscln;
        denominator /= uscln;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    void ouput() {
        simplify();

        if (denominator == 1) {
            System.out.println("Phân số sau khi rút gọn: " + numerator);
        } else {
            System.out.println("Phân số sau khi rút gọn: " + numerator + "/" + denominator);
        }
    }

    void calSum(Fraction phanSoKhac) {
        // tạo biến mới cho phân số khác
        double tuSoKhac = phanSoKhac.numerator;
        double mauSoKhac = phanSoKhac.denominator;

        // Tính tổng 2 phân số
        double tongTuSo = numerator * mauSoKhac + tuSoKhac * denominator;
        double tonoMauSo = denominator * mauSoKhac;

        // rút gọn tổng 2 ps
        double uslnPS = USCLN(tongTuSo, tonoMauSo);
        tongTuSo /= uslnPS;
        tonoMauSo /= uslnPS;

        System.out.println("Tổng hai phân số là: " + tongTuSo + "/" + tonoMauSo);
    }
}
