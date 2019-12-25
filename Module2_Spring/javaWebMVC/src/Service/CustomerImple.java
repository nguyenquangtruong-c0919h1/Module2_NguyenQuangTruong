package Service;

import Model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerImple implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Truong", "Truong@gmail.com", "DaNang"));
        customers.put(2, new Customer(2, "Nguyen", "Nguyen@gmail.com", "HaNoi"));
        customers.put(3, new Customer(3, "Quang", "Quang@gmail.com", "QuangNam"));
        customers.put(4, new Customer(4, "Phi", "Phi@gmail.com", "QuangTri"));
        customers.put(5, new Customer(5, "Luu", "Luu@gmail.com", "QuangBinh"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getID(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
