package CaseStudyModule2.Task7.Commons;

import CaseStudyModule2.Task7.Models.Customer;
import CaseStudyModule2.Task7.Models.House;
import CaseStudyModule2.Task7.Models.Room;
import CaseStudyModule2.Task7.Models.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncWriteAndReadCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final int NUM_OF_LINE_SKIP = 1;
    private static final String pathVilla = "src/CaseStudyModule2/Task7/Data/Villa.csv";
    private static final String pathHouse = "src/CaseStudyModule2/Task7/Data/House.csv";
    private static final String pathRoom = "src/CaseStudyModule2/Task7/Data/Room.csv";
    private static final String pathCustomer = "src/CaseStudyModule2/Task7/Data/Customer.csv";
    private static String[] headerRecordVilla = new String[]{"ID", "nameServices", "areaUsed", "rentalCost",
            "maxinumNumber", "typeRent", "roomStandard", "otherFacilities", "poolArea", "numberOfFloor"
    };
    private static String[] headerRecordHouse = new String[]{"ID", "nameServices", "areaUsed", "rentalCost",
            "maxinumNumber", "typeRent", "roomStandard", "otherFacilities", "numberOfFloor"
    };
    private static String[] headerRecordRoom = new String[]{"ID", "nameServices", "areaUsed", "rentalCost",
            "maxinumNumber", "typeRent", "freeServices"
    };
    private static String[] headerRecordCustomer = new String[]{"ID", "nameCustomer", "brithday", "gender",
            "idCard", "numberPhone", "email", "guestType", "address"};

    public static void writerVillaToFileCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                                villa.getID(),
                                villa.getNameServices(),
                                String.valueOf(villa.getAreaUsed()),
                                String.valueOf(villa.getRentalCost()),
                                String.valueOf(villa.getMaxinumNumber()),
                                String.valueOf(villa.getTypeRent()),
                                villa.getRoomStandard(),
                                villa.getOtherFacilities(),
                                String.valueOf(villa.getPoolArea()),
                                String.valueOf(villa.getNumberOfFloor())

                        }
                );
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writerHouseToFileCSV(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordHouse);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getID(), house.getNameServices(),
                        String.valueOf(house.getAreaUsed()),
                        String.valueOf(house.getRentalCost()),
                        String.valueOf(house.getMaxinumNumber()),
                        String.valueOf(house.getTypeRent()),
                        house.getRoomStandard(),
                        house.getOtherFacilities(),
                        String.valueOf(house.getNumberOfFloor())
                });
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writerRoomToFileCSV(ArrayList<Room> arrayList) {
        try (Writer writer = new FileWriter(pathRoom);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordRoom);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]{
                        room.getID(),
                        room.getNameServices(),
                        String.valueOf(room.getAreaUsed()),
                        String.valueOf(room.getRentalCost()),
                        String.valueOf(room.getMaxinumNumber()),
                        String.valueOf(room.getTypeRent()),
                        room.getFreeServices()
                });
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeCustomerToFileCSV(ArrayList<Customer> arrayList) {
        try (Writer writer = new FileWriter(pathCustomer);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordCustomer);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{customer.getID(),
                        customer.getNameCustomer(),
                        customer.getBrithday(),
                        customer.getGender(),
                        String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getNumberPhone()),
                        customer.getEmail(),
                        customer.getGuestType(),
                        customer.getAddress()});
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Villa> getVillaFromCSV() {
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathVilla);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);

        CsvToBean<Villa> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();
    }

    public static ArrayList<House> getHouseFromCSV() {
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathHouse);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);

        CsvToBean<House> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();
    }

    public static ArrayList<Room> getRoomFromCSV() {
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathRoom);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordRoom);

        CsvToBean<Room> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Room>) csvToBean.parse();
    }
    public static ArrayList<Customer> getCustomerFromCSV(){
        Path path = Paths.get(pathCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathCustomer);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustomer);

          CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }
}
