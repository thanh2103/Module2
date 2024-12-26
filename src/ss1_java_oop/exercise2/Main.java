package ss1_java_oop.exercise2;

public class Main {
    public static void main(String[] args) {
        PhanSo phanso1 = new PhanSo();
        phanso1.Input();
        phanso1.Output();

        PhanSo phanso2 = new PhanSo();
        phanso2.Input();
        phanso2.Output();

        PhanSo tong = phanso1.cong(phanso2);
        System.out.println("Tổng của 2 phân số: ");
        tong.Output();

        PhanSo hieu = phanso1.hieu(phanso2);
        System.out.println("Hiệu của 2 phân số: ");
        hieu.Output();

        PhanSo tich = phanso1.nhan(phanso2);
        System.out.println("Tích của 2 phân số: ");
        tich.Output();

        PhanSo thuong = phanso1.nhan(phanso2);
        System.out.println("Thương của 2 phân số: ");
        thuong.Output();

        System.out.println("Phân số thứ nhất là: " + (phanso1.isPSBangKhong() ? "Bằng không" : "Khác không"));
        System.out.println("Phân số thứ nhất là: " + (phanso1.isPhanSoAm() ? "Phân số âm" : "Phân số dương"));

        System.out.println("Phân số thứ nhất là: " + (phanso2.isPSBangKhong() ? "Bằng không" : "Khác không"));
        System.out.println("Phân số thứ nhất là: " + (phanso2.isPhanSoAm() ? "Phân số âm" : "Phân số dương"));
    }
}
