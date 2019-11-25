package LapTrinhJava;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to nho hon 100 la");
        for (int i = 3; i < 100; i++) {
            if (KiemTra(i))
                System.out.println(" " + i);
        }

    }

    static boolean KiemTra(int n) {
        if (n < 2)
            return false;
        for (int i = 3; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
