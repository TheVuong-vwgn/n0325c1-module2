package ss7.Exercise1;

import ss7.Exercise1.validation.PhoneValidation;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int quantity;

    public NewPhone() {
    }

    public NewPhone(String id, String name, double price, int warranty, String manufacturer, int quantity) {
        super(id, name, price, warranty, manufacturer);
        this.quantity = quantity;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * quantity;
    }

    @Override
    public void input() {
        super.input();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng: ");
        this.quantity = scanner.nextInt();
    }

    @Override
    public void output() {
        super.input();
        this.quantity = PhoneValidation.inputQuantity("Số lượng");
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
