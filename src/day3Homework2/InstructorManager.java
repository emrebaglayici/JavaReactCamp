package day3Homework2;

public class InstructorManager {
    Instructor instructor;

    public InstructorManager(Instructor instructor) {
        this.instructor = instructor;
    }
    public Student getStudents(){
        return instructor.getStudent();
    }
    public void giveHomework(String homework){
        instructor.setAddNewHomework(getStudents().setMyHomeworks(homework));
    }


}
