package ss1_java_oop.exercise3;

import java.util.Scanner;

public class ToaDo {
    private int x;
    private int y;

    public ToaDo() {
    }

    public ToaDo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập x: ");
        x = Integer.parseInt(in.nextLine());
        System.out.println("Nhập y: ");
        y = Integer.parseInt(in.nextLine());
    }

    double distanceTo(ToaDo ts) {
        return Math.sqrt((ts.x - this.x) * (ts.x - this.x) + (ts.y - this.y) * (ts.y - this.y));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
