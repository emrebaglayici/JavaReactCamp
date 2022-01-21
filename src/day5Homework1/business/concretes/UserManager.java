package day5Homework1.business.concretes;
import day5Homework1.business.abstracts.UserService;
import day5Homework1.core.GoogleService;
import day5Homework1.dataAccess.abstracts.UserDao;
import day5Homework1.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserService {
    private UserDao userDao;
    private GoogleService googleService;

    public UserManager(UserDao userDao, GoogleService googleService) {
        super();
        this.userDao = userDao;
        this.googleService = googleService;
    }

    @Override
    public boolean validateIfRegistered(User user) {
        ArrayList<User> arrayList=new ArrayList<>();
        arrayList.add(user);
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).getEmail()==user.getEmail())
                return true;
        }
        return false;
    }
    @Override
    public void sendValidationEmail(User user) {
        System.out.println(user.getEmail()+" Mail adresine doğrulama kodu gönderildi");
    }

    @Override
    public void confirmationEmail(User user) {
        System.out.println(user.getFirstName()+" Mail adresini doğruladı");
    }


    @Override
    public void register(User user) {
        if(!(user.getFirstName().isEmpty()||user.getLastName().isEmpty()||user.getPassword().isEmpty()||user.getEmail().isEmpty())) {
            if ((user.getFirstName().matches(".{2,}"))&&(user.getLastName().matches(".{2,}"))) {
                if(user.getEmail().matches("^(.+)@(.+)$")){
                    if (user.getPassword().matches(".{6,}")) {
                        if((this.validateIfRegistered(user))) {
                            System.out.println("Kayıt Başarılı");
                            this.userDao.register(user);
                            /*this.userDao.getUsers(user);*/
                            sendValidationEmail(user);
                            confirmationEmail(user);
                            this.googleService.login("Giriş yapıldı");
                        }
                        else
                            System.out.println("Kullanıcı sistemde kayıtlı");

                    } else
                        System.out.println("Parola en az 6 karakterden oluşmalıdır");

                }else
                    System.out.println("Girdiğiniz mail adresi , mail formatına uygun değil");

            } else
                System.out.println("Ad ve soyadınız en az iki karakterden oluşmalıdır");

        }
        else
            System.out.println("Lütfen tüm alanları giriniz");
    }

    @Override
    public void login(String message) {

    }

    @Override
    public List<User> getUsers(User user) {
        List<User> users=new ArrayList<User>();
        users.add(user);
        System.out.println("sad");
        return users;
    }
}
