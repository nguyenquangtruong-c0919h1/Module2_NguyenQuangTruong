package LapTrinhJava;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        int thang;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Nhap thang");
        thang = scaner.nextInt();
        sothang(thang);
    }

    static void sothang(int i) {
        switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Co 30 ngay");
                break;
            case 2:
                System.out.println("Co 28 hoac 29 ngay");
                break;
            default:
                System.out.println("ban nhap sai");
        }
    }
}
