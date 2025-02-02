package ss2_java_constructor.exercise1;

public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
        tu = 0;
        mau = 2;
    }

    public PhanSo(int tu) {
        this.tu = tu;
        mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
        rutGon();
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

    public PhanSo copy() {
        return new PhanSo(tu, mau);
    }

    public void cong(int n) {
        tu += n * mau;
        rutGon();
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
        tu = Math.abs(tu);
        mau = Math.abs(mau);

        int min = Math.min(tu, mau);
        int max = Math.max(tu, mau);

        if (max % min == 0) {
            return min;
        }

        for (int i = min / 2; i >= 1; i--) {
            if (tu % i == 0 && mau % i == 0) {
                return i;
            }
        }
        return 1;
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
