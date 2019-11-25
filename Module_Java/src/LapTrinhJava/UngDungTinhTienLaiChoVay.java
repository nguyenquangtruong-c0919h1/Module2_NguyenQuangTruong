package LapTrinhJava;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        float soTien;
        float laiSuat;
        int soThang;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So tien");
        soTien = scanner.nextFloat();
        System.out.println("Nhap lai suat");
        laiSuat = scanner.nextFloat();
        System.out.println("Nhap so thang");
        soThang = scanner.nextInt();
        System.out.println(Tinh(soTien, laiSuat, soThang));
    }

    static float Tinh(float soTien, float laiSuat, int soThang) {
        return soTien * (laiSuat / 12) * soThang;
    }
}
