package MangVaPhuongThuc;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập danh sách tối đa ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Bạn nhập quá danh sách");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap gia tri vao mang");
            array[i] = scanner.nextInt();
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + " ");
        }
        int max = array[0];
        for (int k = 0; k < array.length; k++) {
            if (max < array[k]) {
                max = array[k];
            }
        }
        System.out.println("So tien lon nhat ma ty phu co la " + max);
    }
}
