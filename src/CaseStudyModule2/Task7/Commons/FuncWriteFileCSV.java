package CaseStudyModule2.Task7.Commons;

import CaseStudyModule2.Task7.Models.House;
import CaseStudyModule2.Task7.Models.Room;
import CaseStudyModule2.Task7.Models.Villa;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class FuncWriteFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/Data/Villa.src";
    private static final String pathHouse = "src/Data/House.src";
    private static final String pathRoom = "src/Data/Room.src";
    private static String[] headerRecordVilla = new String[]{"ID", "nameServices", "areaUsed", "rentalCost",
            "maxinumNumber", "typeRent", "roomStandard", "otherFacilities", "poolArea", "numberOfFloor"
    };
    private static String[] headerRecordHouse = new String[]{"ID", "nameServices", "areaUsed", "rentalCost",
            "maxinumNumber", "typeRent", "roomStandard", "otherFacilities", "numberOfFloor"
    };
    private static String[] headerRecordRoom = new String[]{"ID", "nameServices", "areaUsed", "rentalCost",
            "maxinumNumber", "typeRent", "freeServices"
    };

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
                        villa.getID(), villa.getNameServices(),
                        String.valueOf(villa.getAreaUsed()),
                        String.valueOf(villa.getRentalCost()),
                        String.valueOf(villa.getMaxinumNumber()),
                        String.valueOf(villa.getTypeRent()),
                        villa.getRoomStandard(),
                        villa.getOtherFacilities(),
                        String.valueOf(villa.getPoolArea()),
                        String.valueOf(villa.getNumberOfFloor())
                });
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
                        room.getID(), room.getNameServices(),
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

}
