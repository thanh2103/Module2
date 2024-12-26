package ss1_java_oop.exercise2;

import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void Input() {
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Nhập tử");
            tu = in.nextInt();
            System.out.println("Nhập mẫu: ");
            mau = in.nextInt();
        } while (mau == 0);
    }

    public void Output() {
        rutGon();
        if (tu == 1 && mau == 1) {
            System.out.println(mau);
        } else if (tu == 0) {
            System.out.println(0);
        } else {
            System.out.println(tu + "/" + mau);
        }

    }

    void rutGon() {
        int uCLN = uocChungLN(tu, mau);
        tu /= uCLN;
        mau /= uCLN;
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }

    int uocChungLN(int tu, int mau) {
        if (tu == 0 || mau == 0) {
            return 1;
        }
        while (mau != 0) {
            int du = tu % mau;
            tu = mau;
            mau = du;
        }
        return Math.abs(tu);
    }

    public PhanSo cong(PhanSo ps) {
        PhanSo tong = new PhanSo();
        tong.tu = this.tu * ps.mau + this.mau * ps.tu;
        tong.mau = this.mau * ps.mau;
        return tong;
    }

    public PhanSo hieu(PhanSo ps) {
        PhanSo hieu = new PhanSo();
        hieu.tu = this.tu * ps.mau - this.mau * ps.tu;
        hieu.mau = this.mau * ps.mau;
        return hieu;
    }

    public PhanSo nhan(PhanSo ps) {
        PhanSo tich = new PhanSo();
        tich.tu = this.tu * ps.tu;
        tich.mau = this.mau * ps.mau;
        return tich;
    }

    public PhanSo thuong(PhanSo ps) {
        PhanSo thuong = new PhanSo();
        thuong.tu = this.tu * ps.mau;
        thuong.mau = this.mau * ps.tu;
        return thuong;
    }

    boolean isPhanSoAm() {
        return mau * tu < 0;
    }

    boolean isPSBangKhong() {
        return mau * tu == 0;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
}
