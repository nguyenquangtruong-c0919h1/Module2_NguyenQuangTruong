package CaseStudyModule2.Task7.Models;

import java.util.Date;

public class Customer{
    private String ID;
    private String nameCustomer;
    private String brithday;
    private String gender;
    private int idCard;
    private int numberPhone;
    private String email;
    private String guestType; //Loại khách
    private String address;

    public Customer() {
    }

    public Customer(String ID, String nameCustomer, String brithday, String gender, int idCard,
                    int numberPhone, String email, String guestType, String address) {
        this.ID = ID;
        this.nameCustomer = nameCustomer;
        this.brithday = brithday;
        this.gender = gender;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
        this.guestType = guestType;
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  void showInfor(){
        System.out.println("Show Information Customer\n"+
                " 1. Name Customer : " + this.getNameCustomer()+
                "\n 2. Brithday : " + this.getBrithday()+
                "\n 3. Gender : " + this.getGender()+
                "\n 4. ID Card : " + this.getIdCard()+
                "\n 5. Number Phone : "+this.getNumberPhone()+
                "\n 6. Email : " + this.getEmail()+
                "\n 7. Guest Type : " + this.getGuestType()+
                "8. Address : " + this.getAddress()
                );
    }
}
