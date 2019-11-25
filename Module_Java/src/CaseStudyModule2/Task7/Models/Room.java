package CaseStudyModule2.Task7.Models;

public class Room extends Services {
    private String freeServices; //Dịch vụ miễn phí đi kèm

    public Room(){}
    public Room(String ID, String nameServices, double areaUsed, double rentalCost, double maxinumNumber, double typeRent, String freeServices) {
        super(ID, nameServices, areaUsed, rentalCost, maxinumNumber, typeRent);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public void showInfor() {
        System.out.println("Name Services : " + getNameServices() +
                "\n Diện tích sử dụng : " + getAreaUsed() +
                "\n Chi phí thuê :" + getRentalCost() +
                "\n Số lượng người tối đa : " + getMaxinumNumber() +
                "\n Kiểu thuê : " + getTypeRent() +
                "\n Dịch vụ miễn phí đi kèm : " + getFreeServices());
    }
}
