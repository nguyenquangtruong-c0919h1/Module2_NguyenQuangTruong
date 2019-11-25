package MangVaPhuongThuc;

import java.util.Scanner;

public class DaoNguocPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Nhap gia tri toi da trong mang");
            size = scaner.nextInt();
            if (size > 20)
                System.out.println("Ban nhap qua gioi han");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap phan tu trong mang");
            array[i] = scaner.nextInt();
            i++;
        }
        System.out.println("Hien thi mang");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + " ");
        }
        for (int k = 0; k < array.length / 2; k++) {
            int temp = array[k];
            array[k] = array[size - 1 - k];
            array[size - 1 - k] = temp;
        }
        System.out.println("Hien thi dao mang");
        for (int m = 0; m < array.length; m++) {
            System.out.println(array[m] + " ");

        }
    }
}
