package day5Homework1.business.abstracts;

import day5Homework1.entities.concretes.User;

import java.util.List;

public interface UserService {
    void register(User User);
    void login(String message);
    List<User> getUsers(User user);
    boolean validateIfRegistered(User user);
    void sendValidationEmail(User user);
    void confirmationEmail(User user);
}
