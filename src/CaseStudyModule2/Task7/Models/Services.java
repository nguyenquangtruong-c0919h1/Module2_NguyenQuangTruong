package CaseStudyModule2.Task7.Models;

public abstract class Services {
    private String ID;
    private String nameServices; //tên dịch vụ
    private double areaUsed; // diện tích sử dụng
    private double rentalCost; //chi phí thuê
    private double maxinumNumber;//số lượng người tối đa
    private double typeRent;//kiểu thuê

    public Services() {
    }

    public Services(String ID, String nameServices, double areaUsed, double rentalCost, double maxinumNumber, double typeRent) {
        this.ID = ID;
        this.nameServices = nameServices;
        this.areaUsed = areaUsed;
        this.rentalCost = rentalCost;
        this.maxinumNumber = maxinumNumber;
        this.typeRent = typeRent;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public double getMaxinumNumber() {
        return maxinumNumber;
    }

    public void setMaxinumNumber(double maxinumNumber) {
        this.maxinumNumber = maxinumNumber;
    }

    public double getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(double typeRent) {
        this.typeRent = typeRent;
    }

    public abstract String showInfor();
}
