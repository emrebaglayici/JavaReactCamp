package day3Homework2;

public class Student extends User{
    private Instructor instructor;
    private String myHomeworks;

    public Student(int id, String firstName, String lastName, String email, String password) {
        super(id, firstName, lastName, email, password);
    }

    public String getMyHomeworks() {
        return myHomeworks;
    }

    public String setMyHomeworks(String myHomeworks) {
        return this.myHomeworks = myHomeworks;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
