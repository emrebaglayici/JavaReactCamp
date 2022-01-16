package day3Homework2;

public class Instructor extends User{
    private Student student;
    private String addNewHomework;

    public Instructor(int id, String firstName, String lastName, String email, String password, Student student) {
        super(id, firstName, lastName, email, password);
        this.student = student;
    }


    public Student getStudent() {
        return student;
    }


    public void setAddNewHomework(String addNewHomework) {
        this.addNewHomework = addNewHomework;
    }
}
