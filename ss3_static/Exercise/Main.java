package ss3_static.Exercise;

public class Main {

    //Khối static cung cấp dữ liệu ban đầu
    static {
        CountStudent a = new CountStudent(1, "name", 5);
        CountStudent b = new CountStudent(1, "name", 5);
        CountStudent c = new CountStudent(1, "name", 5);
        CountStudent d = new CountStudent(1, "name", 5);
    }

    public static void main(String[] args) {
        int cout = CountStudent.cout();
        System.out.println(cout);
    }
}
