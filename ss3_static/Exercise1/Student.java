package ss3_static.Exercise1;

import java.util.Scanner;

public class Student extends Person {
    private double score;

    public Student() {
        super(); // gọi lên constructor cha
    }

    public Student(int id, String name, double score) {
        super(id, name);
        this.score = score;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        super.input();
        System.out.print("Nhập điểm: ");
        this.score = Double.parseDouble(scanner.nextLine());
    }

    public void output() {
        super.output();
        System.out.println("Điểm: " + this.score);
    }
}
