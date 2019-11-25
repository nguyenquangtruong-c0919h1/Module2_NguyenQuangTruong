package LapTrinhJava;


import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float weight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width = ");
        width = scanner.nextFloat();
        System.out.println("Enter weight = ");
        weight = scanner.nextFloat();
        Area(width, weight);
    }

    static void Area(float a, float b) {
        float area = a * b;
        System.out.println(area);

    }
}
