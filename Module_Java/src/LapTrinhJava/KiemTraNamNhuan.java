package LapTrinhJava;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam de kiem tra");
        year = scanner.nextInt();
        KiemTra(year);
    }

    static void KiemTra(int number) {
        if (number % 4 == 0 && number % 100 != 0) {
            System.out.println(number + " La nam nhuan");
        } else if (number % 400 == 0 && number % 100 == 0) {
            System.out.println(number + " La nam nhuan");
        } else {
            System.out.println(number + "khong phai la nam nhuan");
        }
    }
}
