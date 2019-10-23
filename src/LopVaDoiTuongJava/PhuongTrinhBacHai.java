package LopVaDoiTuongJava;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap a =");
        a = scanner.nextInt();
        System.out.println("Nhap b =");
        b = scanner.nextInt();
        System.out.println("Nhap c =");
        c = scanner.nextInt();
        PhuongTrinh phuongTrinh = new PhuongTrinh(a, b, c);
        float delta = phuongTrinh.delta();
        if (delta < 0) {
            System.out.println("The equation has no roots");
        } else if (delta == 0) {
            System.out.println("x = "+ phuongTrinh.getRoot1());
        }else{
            System.out.println(phuongTrinh.getRoot1());
            System.out.println(phuongTrinh.getRoot2());

    }
}

public static class PhuongTrinh {
    int a, b, c;

    public PhuongTrinh(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

    public float delta() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public float getRoot1() {
        return (float) ((-this.b + Math.pow(delta(), 0.5)) / (2 * this.a));
    }

    public float getRoot2() {
        return (float) ((-this.b - Math.pow(delta(), 0.5)) / (2 * this.a));
    }


}
}