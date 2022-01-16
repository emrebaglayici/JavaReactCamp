package day3Homework2;

public class UserManager {
    User user;

    public UserManager(User user) {
        this.user = user;
    }
    public String showInformation(User user){
        return user.getFirstName()+" "+user.getLastName()+" "+user.getEmail()+" "+user.getPassword();
    }
    public void editProfile(String firstName, String lastName, String email, String password){
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(password);
    }
}
