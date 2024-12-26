package ss1_java_oop.exercise3;

public class Main {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo();
        td1.input();

        ToaDo td2 = new ToaDo();
        td2.input();

        double khoanCach=td1.distanceTo(td2);
        System.out.println("Khoảng cách: "+khoanCach);
    }
}
