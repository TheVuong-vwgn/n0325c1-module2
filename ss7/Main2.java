package ss7;

public class Main2 {
    public static void main(String[] args) {
        try {
            int x = 10;
        } catch (Under18YearOldException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Chương trình kết thúc không lỗi lầm!!");
    }

    public static void input(int age) {
        if (age < 18) {
            throw new Under18YearOldException("Bạn chưa đủ tuổi");
        }
    }
}
