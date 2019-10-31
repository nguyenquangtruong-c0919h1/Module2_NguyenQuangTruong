package CaseStudyModule2.Task7.Models;

public class House extends Services {
    private String roomStandard;//Tiêu chuẩn phòng
    private String otherFacilities; //Mô tả tiện nghi khác
    private int numberOfFloor; //Số
    public House() {

    }
    public House(String ID, String nameServices, double areaUsed, double rentalCost, double maxinumNumber, double typeRent, String roomStandard, String otherFacilities, int numberOfFloor) {
        super(ID, nameServices, areaUsed, rentalCost, maxinumNumber, typeRent);
        this.roomStandard = roomStandard;
        this.otherFacilities = otherFacilities;
        this.numberOfFloor = numberOfFloor;
    }



    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfor() {
        return "Name Services : " + super.getNameServices() +
                "\n Diện tích sử dụng : " + super.getAreaUsed() +
                "\n Chi phí thuê :" + super.getRentalCost() +
                "\n Số lượng người tối đa : " + super.getMaxinumNumber() +
                "\n Kiểu thuê : " + super.getTypeRent() +
                "\n Tiêu chuẩn phòng " + this.getRoomStandard() +
                "\n Tiện nghi khác : " + this.getOtherFacilities() +
                "\n Số tầng : " + this.getNumberOfFloor();
    }
}
