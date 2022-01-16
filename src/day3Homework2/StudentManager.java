package day3Homework2;

public class StudentManager {
    Student student;

    public StudentManager(Student student) {
        this.student = student;
    }

    public String listHomework(){
        return student.getMyHomeworks();
    }
    public String showInstructorName(Instructor instructor){
        return instructor.getFirstName();
    }
}
