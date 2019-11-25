package MangVaPhuongThuc;

import java.util.Scanner;

public class DemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int dem;
        float[] arrayDiem;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so luong sinh vien");
            dem = scanner.nextInt();
            if (dem > 30)
                System.out.println("Ban nhap qua so luong cho phep");
        } while (dem > 30);
        int i = 0;
        arrayDiem = new float[dem];
        while (i < arrayDiem.length) {
            System.out.println("Nhap diem cua sinh vien");
            arrayDiem[i] = scanner.nextFloat();
            i++;
        }
        hienThiDiem(arrayDiem);
        demSoSinhVienDo(arrayDiem);
    }

    static void hienThiDiem(float[] array) {
        System.out.println("Hien thi diem sinh vien");
        for (int i = 0; i < array.length; i++) {
            System.out.println(" , " + array[i]);
        }
    }

    static void demSoSinhVienDo(float[] array) {
        System.out.println("Dem so sinh vien");
        int demSinhVien = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5) {
                System.out.println(array[i]);
                demSinhVien++;
            }}
            System.out.println("Co " + demSinhVien + " sinh vien thi do");

    }
}
