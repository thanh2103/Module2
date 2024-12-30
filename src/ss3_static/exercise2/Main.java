package ss3_static.exercise2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b;
        System.out.print("Nhap a: ");
        a = sc.nextDouble();
        System.out.print("Nhap b: ");
        b = sc.nextDouble();
        System.out.printf("%.1f + %.1f = %.1f\n", a, b, MathUtil.add(a, b));
        System.out.printf("%.1f - %.1f = %.1f\n", a, b, MathUtil.sub(a, b));
        System.out.printf("%.1f x %.1f = %.1f\n", a, b, MathUtil.mul(a, b));
        System.out.printf("%.1f / %.1f = %.1f\n", a, b, MathUtil.div(a, b));
    }//
}
