package ss2_java_constructor.exercise2;

public class Main {
    public static void main(String[] args) {
        ThoiGian a=new ThoiGian();
        a.outPut();
        System.out.println();

        ThoiGian b=new ThoiGian(7);
        b.outPut();

        System.out.println();
        ThoiGian c=new ThoiGian(7,30);
        c.outPut();

        System.out.println();
        ThoiGian d=new ThoiGian(7,30,30);
        d.outPut();

        System.out.println();
        ThoiGian e=new ThoiGian(d);
        e.outPut();

    }
}
