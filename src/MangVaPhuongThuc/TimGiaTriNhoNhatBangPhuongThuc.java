package MangVaPhuongThuc;

import java.util.Scanner;

public class TimGiaTriNhoNhatBangPhuongThuc {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap kich thuoc mang ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Ban nhap qua kich thuoc cho phep");
        } while (size > 20);
        array = new int[size];

        int i = 0;
        while (i < size) {
            System.out.println("Nhap thong tin = ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Hien thi mang");
        for (int j = 0; j < array.length; j++) {
            System.out.println(" " + array[j]);
        }
        int min = array[0];
        for (int k = 0; k < array.length; k++) {
            if (min > array[k]) {
                min = array[k];
            }
        }
        System.out.println("Gia tri nho nhat trong mang la " + min);
    }
}
