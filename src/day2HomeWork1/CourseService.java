package day2HomeWork1;
public class CourseService {
    public void enrollButton(Courses courses){
        System.out.println("Enrolled "+courses.getCourseName());
    }
    public void filterByInstructor(String name){
        System.out.println("Your Instructor "+name);
    }
    /*public Courses getAllCourses(){
        return
    }*/
    /*public void storeCourses(Courses[] courses){
        Courses[] allCourses={courses};
        return allCourses;
    }*/
}
