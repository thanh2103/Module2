package ss4_kethua.exercise1;

import java.util.Scanner;

public abstract class Phone implements Comparable<Phone>{
    private String id;
    private String ten;
    private int gia;
    private int thoiGianBaoHanh;
    private String hang;

    public abstract double tinhTongTien();
    public Phone() {
    }

    public Phone(String id, String ten, int gia, int thoiGianBaoHanh, String hang) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.hang = hang;
    }

    @Override
    public int compareTo(Phone o) {
        return Double.compare(this.gia, o.getGia());
    }

    public void input(String id){
        Scanner in = new Scanner(System.in);
        this.id=id;
        System.out.print("Nhập tên: ");
        ten =in.nextLine();
        System.out.print("Gia: ");
        gia = Integer.parseInt(in.nextLine());
        System.out.print("Thoi Gian Bao Hanh: ");
        thoiGianBaoHanh = Integer.parseInt(in.nextLine());
        System.out.print("Hãng: ");
        hang = in.nextLine();
    }

    public void output(){
        System.out.println("Id: "+id);
        System.out.println("Ten: "+ten);
        System.out.println("Gia: "+gia);
        System.out.println("Thoi Gian Bao Hanh: "+thoiGianBaoHanh);
        System.out.println("Hang: "+hang);
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
}
