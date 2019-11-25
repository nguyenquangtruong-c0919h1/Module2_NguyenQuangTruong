package CaseStudyModule2.Task7.Views;

import CaseStudyModule2.Task7.Controllers.MainControllers;
import CaseStudyModule2.Task7.Models.Services;
import CaseStudyModule2.Task7.Models.Villa;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Services villa = new Villa();
//        villa.setID(UUID.randomUUID().toString().replace("-",""));
//        System.out.println("Enter Name Services");
//        villa.setNameServices(scanner.nextLine());
//        System.out.println("Enter Area Used");
//        villa.setAreaUsed(scanner.nextDouble());
//        System.out.println("Enter RentCost");
//        villa.setRentalCost(scanner.nextDouble());
//        System.out.println("Enter Maxinum Number");
//        villa.setMaxinumNumber(scanner.nextDouble());
//        System.out.println("Enter Type Rent");
//        villa.setTypeRent(scanner.nextDouble());
//        scanner.nextLine();
//        System.out.println("Enter Room Standard");
//        ((Villa)villa).setRoomStandard(scanner.nextLine());
//        System.out.println("Enter Other Facilities");
//        ((Villa)villa).setOtherFacilities(scanner.nextLine());
//        System.out.println("Enter Pool Area");
//        ((Villa)villa).setPoolArea(scanner.nextDouble());
//        System.out.println("Enter Num Of Floor");
//        ((Villa)villa).setNumberOfFloor(scanner.nextInt());
//        System.out.println(villa.showInfor());
//
        MainControllers mainControllers = new MainControllers();
        mainControllers.displayMainMenu();
    }

}
