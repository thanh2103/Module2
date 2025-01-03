package ss4_kethua.exercise1;

import java.util.Scanner;

public class OldPhone extends Phone{
    private String id;
    private String tinhTrangPin;
    private String moTa;
    private static String idOldPhone = "DTC";
    private static int xxx = 0;

    public OldPhone() {
        super();
        xxx++;
    }

    public OldPhone(String id, String ten, int gia, int thoiGianBaoHanh, String hang, String tinhTrangPin, String moTa) {
        super(id, ten, gia, thoiGianBaoHanh, hang);
        this.tinhTrangPin = tinhTrangPin;
        this.moTa = moTa;
    }

    public void input() {
        String idstr = String.format("%03d", xxx);
        this.id = idOldPhone + idstr;
        Scanner in = new Scanner(System.in);
        super.input(id);
        System.out.println("Nhập tinh trang pin: ");
        tinhTrangPin = in.nextLine();
        System.out.println("Nhập mô tả: ");
        moTa = in.nextLine();
    }

    public void output() {
        super.output();
        System.out.println("Tình trạng pin: " + tinhTrangPin);
        System.out.println("Mô tả: " + moTa);
    }

    public String getTinhTrangPin() {
        return tinhTrangPin;
    }

    public void setTinhTrangPin(String tinhTrangPin) {
        this.tinhTrangPin = tinhTrangPin;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public double tinhTongTien() {
        return getGia();
    }
}
