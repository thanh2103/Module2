package ss2_java_constructor.exercise3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"Nguyễn văn a",7);

        System.out.println("Thông tin sinh viên: ");
        System.out.println("Nhập id: "+student.getiD());
        System.out.println("Nhập tên: "+student.getName());
        System.out.println("Nhập điểm: "+student.getScore());

        System.out.println("====Cập nhật thông tin:===== ");
        student.setName("Nguyen Thuy Thanh");
        student.setScore(9);

        System.out.println("====Thông tin sinh viên sau khi cập nhật:==== ");
        System.out.println("Nhập id: "+student.getiD());
        System.out.println("Nhập tên: "+student.getName());
        System.out.println("Nhập điểm: "+student.getScore());

        System.out.println("====Cập nhật thông tin sai:===== ");
        student.setName(" ");
        student.setScore(90);

        System.out.println("====Thông tin sinh viên sau khi cập nhật:==== ");
        System.out.println("Nhập id: "+student.getiD());
        System.out.println("Nhập tên: "+student.getName());
        System.out.println("Nhập điểm: "+student.getScore());
    }
}
