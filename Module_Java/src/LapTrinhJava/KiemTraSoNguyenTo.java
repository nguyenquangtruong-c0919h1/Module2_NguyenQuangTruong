package LapTrinhJava;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        int checkSoNguyenTo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen to = ");
        checkSoNguyenTo = scanner.nextInt();
        KiemTra(checkSoNguyenTo);
    }

    static void KiemTra(int number) {
        int i = 2;
        if (number < 2) {
            System.out.println("Khong phai la so nguyen to");
        } else {
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                }
                i++;

            }
            if (check)
                System.out.println(number + " la so nguyen to");
            else
                System.out.println(number + " k phai la so nguyen to");
        }


    }
}
