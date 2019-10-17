package LapTrinhJava;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD cần đổi : ");
        float usd = scanner.nextFloat();
        System.out.println(tinhToan(usd));
    }

    static float tinhToan(float a) {
        return a * 23000;
    }

}
