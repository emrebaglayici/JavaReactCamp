package day5Homework1.dataAccess.concretes;
import day5Homework1.dataAccess.abstracts.UserDao;
import day5Homework1.entities.concretes.User;
import java.util.List;

public class ManuelUserDao implements UserDao {
    @Override
    public void register(User user) {
        System.out.println("Kullanıcı Manuel olarak kayıt yaptı"+ user.getFirstName());
    }

    @Override
    public void login(User user) {

    }
    @Override
    public List<User> getUsers(User user) {
        return null;
    }

    @Override
    public void sendValidationEmail(User user) {
    }

    @Override
    public void confirmationEmail(User user) {
    }

    @Override
    public User get(String firstname) {
        return null;
    }
}
