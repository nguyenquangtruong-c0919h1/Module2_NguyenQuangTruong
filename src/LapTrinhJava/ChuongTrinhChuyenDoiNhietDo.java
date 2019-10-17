package LapTrinhJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choose;
        float c;
        float f;
        do {

            System.out.println("Chuyen doi nhiet do");
            System.out.println("1. Tu do C qua do F");
            System.out.println("2. Tu do F qua do C");
            System.out.println("3. Exit");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhap do C = ");
                    c = scanner.nextFloat();
                    System.out.println(convertCtoF(c));
                    break;
                case 2:
                    System.out.println("Nhap do F");
                    f = scanner.nextFloat();
                    System.out.println(convertFtoC(f));
                    break;
                case 3:
                    System.exit(3);
            }
        } while (choose != 0);
    }

    static float convertCtoF(float f) {
        return (float) ((5.0 / 9) * (f - 32));
    }

    static float convertFtoC(float c) {
        return (float) (9.0 / 5) * c + 32;
    }
}
