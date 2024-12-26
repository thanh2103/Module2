package ss2_java_constructor.exercise1;

public class Main {
    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        a.Output();

        PhanSo b = new PhanSo(1, 3);
        b.Output();

        PhanSo c = new PhanSo(3);
        c.Output();

        PhanSo d = new PhanSo(-6, -2);
        d.Output();

        PhanSo e = new PhanSo(3, -1);
        e.Output();
        System.out.println("Copy");

        PhanSo f = e.copy();
        f.cong(100);
        e.Output();
        f.Output();


    }
}
