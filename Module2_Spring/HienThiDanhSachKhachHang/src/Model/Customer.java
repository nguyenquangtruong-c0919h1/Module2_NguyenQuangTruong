package Model;

import java.sql.DatabaseMetaData;
import java.sql.Date;

public class Customer {
    int id;
    String name;
    String birthday;
    String address;
    String picture;

    public Customer() {
    }

    public Customer(int id, String name, String birthday, String address, String picture) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
