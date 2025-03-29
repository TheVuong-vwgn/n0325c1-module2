package ss7.Exercise1;

import ss7.Exercise1.validation.PhoneValidation;


public class OldPhone extends Phone implements Discountable {
    private int batteryPercentage;
    private String description;

    public OldPhone(){
    }

    public OldPhone(String id, String name, double price, int warranty, String manufacturer, int batterpyPercentage, String decription) {
        super(id, name, price, warranty, manufacturer);
        this.batteryPercentage = batterpyPercentage;
        this.description = decription;
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
        this.batteryPercentage = PhoneValidation.inputBatteryPercentage("Tình trạng pin (%)");
        this.description = PhoneValidation.inputDescription("Mô tả thêm");
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Tình trạng pin (%): " + this.batteryPercentage);
        System.out.println("Mô tả thêm: " + this.description);
    }

    public int getBatterpyPercentage() {
        return batteryPercentage;
    }

    public void setBatterpyPercentage(int batterpyPercentage) {
        this.batteryPercentage = batterpyPercentage;
    }

    public String getDecription() {
        return description;
    }

    public void setDecription(String decription) {
        this.description = decription;
    }
}
