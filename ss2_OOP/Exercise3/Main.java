package ss2_OOP.Exercise3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        Point point1 = new Point();

        System.out.println("Nhập tọa độ của điểm thứ nhất");
        point.input();

        System.out.println("Nhập tọa độ của điểm thứ hai");
        point1.input();

        double distance = point.distanceTo(point1);

        System.out.println("Khoảng cách giữa hai điểm là: " + distance);
    }
}
