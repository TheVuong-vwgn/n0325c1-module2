package ss3_static.Exercise;

public class CountStudent {
    int id;
    String name;
    double score;
    static int countStudent = 0;


    public CountStudent(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        countStudent++;
    }

    static int cout() {
        return countStudent;
    }
}
