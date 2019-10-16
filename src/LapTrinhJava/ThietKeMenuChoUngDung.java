package LapTrinhJava;

import java.util.Scanner;

public class ThietKeMenuChoUngDung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle\n");
        System.out.println("2. Draw the square\n");

        System.out.println("3. Draw the rectangle\n");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:\n");
        while (true){
            int choose ;
            choose=scanner.nextInt();
        Menu(choose);
    }}
    static void Menu(int choose) {
        switch (choose){
        case 1:
            System.out.println("Draw the triangle");
            System.out.println("******");
            System.out.println("*****");
            System.out.println("****");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
            break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");

    }
}}
