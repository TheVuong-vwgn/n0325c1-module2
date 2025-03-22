package ss3_static.Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chose;

        do {
            System.out.println("- CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI");
            System.out.println("1. Xem danh sách điện thoại");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Sắp xếp theo giá");
            System.out.println("6. Tìm kiếm");
            System.out.println("7. Tính tổng tiền");
            System.out.println("8. Giảm giá cho điện thoại cũ");
            System.out.println("9. Thoát");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập chức năng: ");
            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                default:
                    System.out.println("Nhập không đúng 1 -> 7, vui lòng nhập lại!!");
            }
        }while (chose < 0 && chose > 10);
    }
}
