package ss7;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập Số điện thoại: ");
        String number = scanner.nextLine();
        System.out.println(number.matches("(0|84)3[2-9][0-9]{7}"));
    }
}
