package ss2_java_constructor.exercise3;

public class Student {
    private int iD;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int iD, String name, double score) {
        this.iD = iD;
        this.name = name;
        this.score = score;
    }

    public int getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().equals("")) {
            System.out.println("Name is null");
        } else {
            this.name = name;
        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("Lỗi score");
        }
    }
}
