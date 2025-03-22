package ss2_OOP.Exercise5;

public class Main {
    public static void main(String[] args) {
        Time a = new Time();
        a.output();

        Time b = new Time(7);
        b.output();

        Time c = new Time(7, 30);
        c.output();

        Time d = new Time(7, 30, 50);
        d.output();

        Time f = new Time(d);
        f.output();
    }
}
