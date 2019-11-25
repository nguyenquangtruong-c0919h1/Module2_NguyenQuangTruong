package CaseStudyModule2.Task7.Controllers;

import CaseStudyModule2.Task7.Commons.CheckValidate;
import CaseStudyModule2.Task7.Commons.FuncWriteAndReadCSV;
import CaseStudyModule2.Task7.Models.*;
import CaseStudyModule2.Task7.Views.Main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainControllers {
    private static Scanner scanner;

    public void displayMainMenu() {
        scanner = new Scanner(System.in);
        System.out.println("1: Add New Services \n" +
                "2: Show Services \n" +
                "3: Add New Customer\n" +
                "4: Show Customer\n" +
                "5: Exit");
        switch (scanner.nextInt()) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                addCustomer();
                break;
            case 4:
                showInformationCustomer();
                break;
            case 5:
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Show All Villa \n" +
                "2: Show All House \n" +
                "3: Show All Room \n" +
                "4: Back To Menu \n" +
                "5: Exit  ");
        switch (scanner.nextInt()) {
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                backToMenu();
                break;
            case 5:
                System.exit(0);
        }
    }

    public static void showAllVilla() {
        ArrayList<Villa> listVilla = FuncWriteAndReadCSV.getVillaFromCSV();
        System.out.println("\n=====================");
        for (Villa villa : listVilla) {
            villa.showInfor();
            System.out.println("\n=====================");
        }
    }

    public static void showAllHouse() {
        ArrayList<House> listHouse = FuncWriteAndReadCSV.getHouseFromCSV();
        System.out.println("\n=====================");
        for (House house : listHouse) {
            house.showInfor();
            System.out.println("\n=====================");
        }
    }

    public static void showAllRoom() {
        ArrayList<Room> listRoom = FuncWriteAndReadCSV.getRoomFromCSV();
        System.out.println("\n=====================");
        for (Room room : listRoom) {
            room.showInfor();
            System.out.println("\n=====================");
        }
    }

    public Services addNewService(Services services) {
        String str = "";
        String mess = "";
        String error = "";
        services.setID(UUID.randomUUID().toString().replace("-", ""));
        scanner.nextLine();
        System.out.println("Enter Name Services");
        str = scanner.nextLine();
        while (!CheckValidate.checkServiceName(str)) {
            System.out.println("Wrong! Please enter again");
            System.out.println("Enter Name Services");
            str = scanner.nextLine();
        }
        services.setNameServices(str);
        mess = "Enter Area Used";
        error = "Wrong! Please enter again. ";
        services.setAreaUsed(CheckValidate.checkDoubleNumber(mess, error));
        while (services.getAreaUsed() <= 30) {
            System.out.println(" Area must be greater than 30 ! " + error);
            services.setAreaUsed(CheckValidate.checkDoubleNumber(mess, error));
        }
        mess = "Enter RentalCost";
        services.setRentalCost(CheckValidate.checkDoubleNumber(mess, error));
        while (services.getRentalCost() <= 0) {
            System.out.println(" Rental must be a positive integer. " + error);
            services.setRentalCost(CheckValidate.checkDoubleNumber(mess, error));
        }
        mess = "Enter MaxinumNumber";
        services.setMaxinumNumber(CheckValidate.checkDoubleNumber(mess, error));
        while (services.getMaxinumNumber() <= 0 && services.getMaxinumNumber() >= 20) {
            System.out.println(" The number of people must be greater than 0 and smaller than 20. \n" + error);
            services.setMaxinumNumber(CheckValidate.checkDoubleNumber(mess, error));
        }
        mess = "Enter Type Rent";
        services.setTypeRent(CheckValidate.checkDoubleNumber(mess, error));
        while (services.getTypeRent() <= 0) {
            System.out.println(error);
            services.setTypeRent(CheckValidate.checkDoubleNumber(mess, error));

        }

        return services;
    }

    public void addNewVilla() {
        String mess = "";
        String error = "Wrong! Please enter again.";
        ArrayList<Villa> listVilla = FuncWriteAndReadCSV.getVillaFromCSV();
        Services villa = new Villa();
        addNewService(villa);
        System.out.println("Enter Room Standard");
        String str = scanner.nextLine();
        while (!CheckValidate.checkServiceName(str)) {
            System.out.println("Wrong! Please enter again");
            System.out.println("Enter Rom Standard");
            str = scanner.nextLine();
        }
        ((Villa) villa).setRoomStandard(str);
        System.out.println("Enter Other Facilities");
        ((Villa) villa).setOtherFacilities(scanner.nextLine());
        mess = "Enter Pool Area";
        ((Villa) villa).setPoolArea(CheckValidate.checkDoubleNumber(mess, error));
        while (((Villa) villa).getPoolArea() <= 30) {
            System.out.println(" Pool Area must be greater than 30 ! " + error);
            ((Villa) villa).setAreaUsed(scanner.nextDouble());
        }
        mess = "Enter Number of Floor";
        ((Villa) villa).setNumberOfFloor(CheckValidate.checkIntNumber(mess, error));
        while (((Villa) villa).getNumberOfFloor() <= 0) {
            System.out.println(" Number Of Floor must be a positive integer. " + error);
            ((Villa) villa).setNumberOfFloor(CheckValidate.checkIntNumber(mess, error));
        }
        listVilla.add((Villa) villa);
        FuncWriteAndReadCSV.writerVillaToFileCSV(listVilla);
        System.out.println("\n Add New Villa : " + villa.getNameServices() + "Successfully");
        backToMenu();
    }

    public void addNewHouse() {
        String mess = "";
        String error = "Wrong! Please enter again.";
        ArrayList<House> listHouse = FuncWriteAndReadCSV.getHouseFromCSV();
        Services house = new House();
        addNewService(house);
        scanner.nextLine();
        System.out.println("Enter Room Standard");
        String str = scanner.nextLine();
        while (!CheckValidate.checkServiceName(str)) {
            System.out.println("Wrong! Please enter again");
            System.out.println("Enter Name Services");
            str = scanner.nextLine();
        }
        ((House) house).setRoomStandard(str);

        System.out.println("Enter Other Facilities");
        ((House) house).setOtherFacilities(scanner.nextLine());
        mess = "Enter Number of Floor";
        ((House) house).setNumberOfFloor(CheckValidate.checkIntNumber(mess, error));
        while (((House) house).getNumberOfFloor() <= 0) {
            System.out.println(" Number Of Floor must be a positive integer. " + error);
            ((House) house).setNumberOfFloor(CheckValidate.checkIntNumber(mess, error));
        }

        listHouse.add((House) house);
        FuncWriteAndReadCSV.writerHouseToFileCSV(listHouse);
        System.out.println("\n Add New House : " + house.getNameServices() + "Successfully");
        backToMenu();
    }

    public void addNewRoom() {
        ArrayList<Room> listRoom = FuncWriteAndReadCSV.getRoomFromCSV();
        Services room = new Room();
        addNewService(room);
        scanner.nextLine();
        ((Room) room).setFreeServices(scanner.nextLine());
        listRoom.add((Room) room);
        FuncWriteAndReadCSV.writerRoomToFileCSV(listRoom);
        System.out.println("\n Add New Room " + room.getNameServices() + "Successfully");
        backToMenu();
    }

    public void addCustomer() {
        Customer customer = new Customer();
        String mess = "";
        String error = "";
        ArrayList<Customer> listCumtomer = FuncWriteAndReadCSV.getCustomerFromCSV();
        System.out.println(" Customer Information");
        customer.setID(UUID.randomUUID().toString().replace("-", ""));
        scanner.nextLine();
        System.out.println("Enter Name Customer");
        String str = scanner.nextLine();
        while (!CheckValidate.checkServiceName(str)) {
            System.out.println("Wrong! Please enter again");
            System.out.println("Enter Name Customer");
            str = scanner.nextLine();
        }
        customer.setNameCustomer(str);
        System.out.println("Enter Brithday");
        str = scanner.nextLine();
        while (!CheckValidate.checkBrithday(str)) {
            System.out.println("Wrong! Please enter again");
            System.out.println("Enter Brithday");
            str = scanner.nextLine();
        }
        customer.setBrithday(str);
        System.out.println("Enter Gender. (Male or Female or Unknow )");
        customer.setGender(CheckValidate.checkGender(scanner.nextLine()));
        mess = "Enter Id Card";
        error = "Wrong! Please enter again";
        customer.setIdCard(CheckValidate.checkIntNumber(mess, error));
        while (customer.getIdCard() < 100000000 && customer.getIdCard() > 999999999) {
            System.out.println(error);
            System.out.println(mess);
            customer.setIdCard(CheckValidate.checkIntNumber(mess, error));
        }
        System.out.println("Enter Number Phone");
        customer.setNumberPhone(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter Email");
        str = scanner.nextLine();
        while (!CheckValidate.checkEmail(str)) {
            System.out.println("Wrong! Please enter again");
            System.out.println("Enter Email");
            str = scanner.nextLine();
        }
        customer.setEmail(str);
        System.out.println("Enter Guest Type");
        customer.setGuestType(scanner.nextLine());
        System.out.println("Enter Address");
        customer.setAddress(scanner.nextLine());
        listCumtomer.add(customer);
        FuncWriteAndReadCSV.writeCustomerToFileCSV(listCumtomer);
        System.out.println("\n Add New Customer : " + customer.getNameCustomer() + " Successfully");
        backToMenu();
    }

    public void showCustomer() {
        ArrayList<Customer> listCustomer = FuncWriteAndReadCSV.getCustomerFromCSV();
        System.out.println("\n=====================");
        for (Customer customer : listCustomer) {
            customer.showInfor();
            System.out.println("\n=====================");
        }
    }

    public void showInformationCustomer() {
        String[] listCustomer;
        String[] customer;

    }
}


