package day5Homework1.dataAccess.abstracts;

import day5Homework1.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void register(User user);
    void login(User user);
    User get(String firstname);
    List<User> getUsers(User user);
    void sendValidationEmail(User user);
    void confirmationEmail(User user);
}
