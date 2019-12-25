package dao;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User us1 = new User();
        us1.setAccount("quangtruong");
        us1.setPassword("123456");
        us1.setAge(20);
        us1.setName("Truong");
        us1.setEmail("quangtruong0412@gmail.com");
        users.add(us1);
        User us2 = new User();
        us2.setAccount("truongquang");
        us2.setPassword("123456");
        us2.setAge(30);
        us2.setName("Quang");
        us2.setEmail("quangtruong0412@gmail.com");
        users.add(us2);
        User us3 = new User();
        us3.setAccount("nguyenquangtruong");
        us3.setPassword("123456");
        us3.setAge(23);
        us3.setName("Nguyen");
        us3.setEmail("quangtruong0412@gmail.com");
        users.add(us3);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword()))
                return u;
        }
        return null;
    }
}
