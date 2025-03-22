package ss2_OOP.Exercise5;

public class Time {
    int gio;
    int phut;
    int giay;

    public Time() {
        gio = 0;
        phut = 0;
        giay = 0;
    }

    Time(int gio) {
        this.gio = gio;
        phut = 0;
        giay = 0;
    }

    Time(int gio, int phut) {
        this.gio = gio;
        this.phut = phut;
        giay = 0;
    }

    Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    Time(Time other) {
        this.gio = other.gio;
        this.phut = other.phut;
        this.giay = other.giay;
    }

    void output(){
        System.out.printf("%02d:%02d:%02d\n", gio, phut, giay);
        // "%02d" là định dạng 1 giá trị số nguyên hiển thị số 0 phía trước
    }
}
