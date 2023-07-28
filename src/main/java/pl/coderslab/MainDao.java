package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.util.Arrays;

public class MainDao {

    public static void main(String[] args) {
        User user = new User();
        user.setUserName("My extra nick");
        user.setPassword("1234");
        user.setEmail("nowyMail@yahoo.com");
        UserDao userDao = new UserDao();
        userDao.create(user);
    }

}
