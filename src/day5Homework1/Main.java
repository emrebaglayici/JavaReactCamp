package day5Homework1;

import day5Homework1.business.abstracts.UserService;
import day5Homework1.business.concretes.UserManager;
import day5Homework1.core.GoogleAdapter;
import day5Homework1.dataAccess.concretes.ManuelUserDao;
import day5Homework1.entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        UserService userService=new UserManager(new ManuelUserDao(),new GoogleAdapter());
        User user=new User("emre","bağlayici","emrebaglayici1@gmail.com","123456");
        userService.register(user);
    }
}
