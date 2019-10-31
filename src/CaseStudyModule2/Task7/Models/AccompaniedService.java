package CaseStudyModule2.Task7.Models;

public class AccompaniedService extends Services {
    private String accompaniedService; //dịch vụ đi kèm

    public AccompaniedService() {
    }

    public AccompaniedService(String ID, String nameServices, double areaUsed, double rentalCost, double maxinumNumber, double typeRent, String accompaniedService) {
        super(ID, nameServices, areaUsed, rentalCost, maxinumNumber, typeRent);
        this.accompaniedService = accompaniedService;
    }

    public String getAccompaniedService() {
        return accompaniedService;
    }

    public void setAccompaniedService(String accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    @Override
    public String showInfor() {
        return "Name Services : " + super.getNameServices() +
                "\n Diện tích sử dụng : " + super.getAreaUsed() +
                "\n Chi phí thuê :" + super.getRentalCost() +
                "\n Số lượng người tối đa : " + super.getMaxinumNumber() +
                "\n Kiểu thuê : " + super.getTypeRent() +
                "\n Dịch vụ đi kèm : " + this.getAccompaniedService();
    }
}
