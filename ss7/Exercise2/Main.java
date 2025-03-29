package ss7.Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập Số điện thoại: ");
        String number = scanner.nextLine();

        System.out.print("Nhập email: ");
        String email = scanner.nextLine();

        System.out.print("Nhập Username: ");
        String userName = scanner.nextLine();

        System.out.print("Nhập Password: ");
        String passWord = scanner.nextLine();

        System.out.println(number.matches("(0|84)3[2-9][0-9]{7}"));

        System.out.println(email.matches("^\\w{6,32}@\\w{2,12}\\.[A-Za-z]{2,12}$"));

        System.out.println(userName.matches("[\\w.]{6,32}"));

        System.out.println(passWord.matches("[A-Z][A-Za-z0-9!@#$%^&*.]{6,32}"));
    }
}
