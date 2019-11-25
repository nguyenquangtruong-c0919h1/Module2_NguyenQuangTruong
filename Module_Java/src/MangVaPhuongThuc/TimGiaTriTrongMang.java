package MangVaPhuongThuc;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String findStudent;
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh ban can tim kiem");
        findStudent = scanner.nextLine();
        boolean isExit=false;
        for(int i=0; i<student.length;i++){
            if(student[i].equals(findStudent)){
                System.out.println("Vị trí của sinh viên " + findStudent + "trong danh sách là " + (i+1));
                isExit=true;
                break;
            }
    }
        if(!isExit)
            System.out.println("Không có trong danh sách");
    }
}
