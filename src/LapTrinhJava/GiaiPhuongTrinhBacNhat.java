package LapTrinhJava;


import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a = ");
        a = scanner.nextFloat();
        System.out.println("Nhap b= ");
        b = scanner.nextFloat();
        GiaiPhuongTrinh(a, b);
    }

    static void GiaiPhuongTrinh(float a, float b) {
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            float tinh = -b / a;
            System.out.println(tinh);
        }
    }
}
