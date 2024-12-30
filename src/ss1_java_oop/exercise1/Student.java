package ss1_java_oop.exercise1;

import java.util.Scanner;

public class Student {
    String name;
    double diemToan;
    double diemVan;


    void inPut() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập name: ");
        name = scanner.nextLine();

        System.out.println("Nhập điểm toán: ");
        diemToan = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập điểm văn: ");
        diemVan = Double.parseDouble(scanner.nextLine());
    }

    double diemTrungBing() {
        return (diemToan + diemVan) / 2;
    }

    void output() {
        System.out.println("Tên:" + name);
        System.out.println("Điểm toán:" + diemToan);
        System.out.println("Điểm văn:" + diemVan);
        System.out.println("Điểm trung bình: " + diemTrungBing());
    }
}
