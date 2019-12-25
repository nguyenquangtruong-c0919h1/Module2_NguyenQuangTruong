package Model;

import java.util.*;

public class ListCustomer {
    private static Map<Integer, Customer> listCustomer;

    static {
        initCustomer();
    }

    private static void initCustomer() {
        listCustomer = new HashMap<>();
        Customer cus1 = new Customer(1, "Mai Văn Hoàn", "1983-08-21", "Hà Nội", "Ảnh");
        Customer cus2 = new Customer(2, "Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "Ảnh");
        Customer cus3 = new Customer(3, "Nguyễn Thái Hòa", "1983-08-22", "Nam Định", "Ảnh");
        Customer cus4 = new Customer(4, "Trần Đăng Khoa", "1983-08-23", "Thanh Hóa", "Ảnh");
        Customer cus5 = new Customer(5, "Nguyễn Đình Thi", "1983-08-23", "Thanh Hóa", "Ảnh");
        listCustomer.put(cus1.getId(), cus1);
        listCustomer.put(cus2.getId(), cus2);
        listCustomer.put(cus3.getId(), cus3);
        listCustomer.put(cus4.getId(), cus4);
        listCustomer.put(cus5.getId(), cus5);

    }

    public static List<Customer> getCustomer() {
        Collection<Customer> c = listCustomer.values();
        List<Customer> customerList = new ArrayList<>();
        customerList.addAll(c);
        return customerList;
    }
}
