package CaseStudyModule2.Task7.Controllers;

import CaseStudyModule2.Task7.Commons.FuncWriteFileCSV;
import CaseStudyModule2.Task7.Models.House;
import CaseStudyModule2.Task7.Models.Room;
import CaseStudyModule2.Task7.Models.Services;
import CaseStudyModule2.Task7.Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainControllers {
    private static Scanner scanner;

    public void displayMainMenu() {
        scanner = new Scanner(System.in);
        System.out.println("1: Add New Services \n" +
                "2: Show Services \n" +
                "3: Exit");
        switch (scanner.nextInt()) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Found !");
                backToMenu();
        }
    }

    public void addNewServices() {
        scanner = new Scanner(System.in);
        System.out.println("1: Add New Villa\n" +
                "2: Add New House \n" +
                "3: Add New Room\n" +
                "4: Back To Menu\n" +
                "5: Exit");
        switch (scanner.nextInt()) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                backToMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Found!");
                backToMenu();
        }
    }

    public void backToMenu() {
        scanner.nextLine();
        displayMainMenu();
    }

    public void showServices() {
    }

    public Services addNewService(Services services) {
        services.setID(UUID.randomUUID().toString().replace("-", ""));
        scanner.nextLine();
        System.out.println("Enter Name Services");
        services.setNameServices(scanner.nextLine());
        System.out.println("Enter Area Used");
        services.setAreaUsed(scanner.nextDouble());
        System.out.println("Enter RentalCost");
        services.setRentalCost(scanner.nextDouble());
        System.out.println("Enter MaxinumNumber");
        services.setMaxinumNumber(scanner.nextDouble());
        System.out.println("Enter TypeRent");
        services.setTypeRent(scanner.nextDouble());
        return services;
    }

    public void addNewVilla() {
        Services villa = new Villa();
        addNewService(villa);
        scanner.nextLine();
        System.out.println("Enter Room Standard");
        ((Villa) villa).setRoomStandard(scanner.nextLine());
        System.out.println("Enter Other Facilities");
        ((Villa) villa).setOtherFacilities(scanner.nextLine());
        System.out.println("Enter Pool Area");
        ((Villa) villa).setPoolArea(scanner.nextDouble());
        System.out.println("Enter Number of Floor");
        ((Villa) villa).setNumberOfFloor(scanner.nextInt());
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        listVilla.add((Villa) villa);
        FuncWriteFileCSV.writerVillaToFileCSV(listVilla);
        System.out.println("\n Add New Villa : " + villa.getNameServices() + "Successfully");
        backToMenu();
    }

    public void addNewHouse() {
        Services house = new House();
        addNewService(house);
        scanner.nextLine();
        System.out.println("Enter Room Standard");
        ((House) house).setRoomStandard(scanner.nextLine());
        System.out.println("Enter Other Facilities");
        ((House) house).setOtherFacilities(scanner.nextLine());
        System.out.println("Enter Number of Floor");
        ((House) house).setNumberOfFloor(scanner.nextInt());
        ArrayList<House> listHouse = new ArrayList<House>();
        listHouse.add((House) house);
        FuncWriteFileCSV.writerHouseToFileCSV(listHouse);
        System.out.println("\n Add New House : " + house.getNameServices() + "Successfully");
        backToMenu();
    }

    public void addNewRoom() {
        Services room = new Room();
        addNewService(room);
        scanner.nextLine();
        ((Room) room).setFreeServices(scanner.nextLine());
        ArrayList<Room> listRoom = new ArrayList<Room>();
        listRoom.add((Room) room);
        FuncWriteFileCSV.writerRoomToFileCSV(listRoom);
        System.out.println("\n Add New Room " + room.getNameServices() + "Successfully");
        backToMenu();
    }
}