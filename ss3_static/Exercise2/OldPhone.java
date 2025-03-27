package ss3_static.Exercise2;

import java.util.Scanner;

public class OldPhone extends Phone implements Discountable {
    private int batterpyPercentage;
    private String decription;

    public OldPhone(){
    }

    public OldPhone(String id, String name, double price, int warranty, String manufacturer, int batterpyPercentage, String decription) {
        super(id, name, price, warranty, manufacturer);
        this.batterpyPercentage = batterpyPercentage;
        this.decription = decription;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice();
    }

    @Override
    public void applyDiscount(double precentDiscount) {
        double discountPrice = getPrice() * (1 - precentDiscount / 100.0);
        setPrice(discountPrice);
    }

    @Override
    public void input() {
        super.input();

        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập vào tình trạng pin (%): ");
        this.batterpyPercentage = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào mô tả thêm: ");
        this.decription = scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Tình trạng pin (%): " + this.batterpyPercentage);
        System.out.println("Mô tả thêm: " + this.decription);
    }

    public int getBatterpyPercentage() {
        return batterpyPercentage;
    }

    public void setBatterpyPercentage(int batterpyPercentage) {
        this.batterpyPercentage = batterpyPercentage;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
