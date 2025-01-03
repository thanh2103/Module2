package ss4_kethua.exercise1;

import java.util.Scanner;

public class NewPhone extends Phone{
    String id;
    private int soLuong;
    private String idNewPhone="DTM";
    private int xxx=0;

    public NewPhone() {
        super();
        xxx++;
    }

    public NewPhone(String id, String ten, int gia, int thoiGianBaoHanh, String hang, int soLuong) {
        super(id, ten, gia, thoiGianBaoHanh, hang);
        this.soLuong = soLuong;
    }

    public void input(){
        String idstr = String.format("%03d", xxx);
        this.id = idNewPhone + idstr;
        Scanner in = new Scanner(System.in);
        super.input(id);
        System.out.println("Nhập số lượng: ");
        soLuong=Integer.parseInt(in.nextLine());
    }

    public void output(){
        super.output();
        System.out.println("Số lượng: "+soLuong);
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public double tinhTongTien() {
        return getSoLuong()*getGia();
    }
}
