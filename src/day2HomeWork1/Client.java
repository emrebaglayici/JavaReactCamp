package day2HomeWork1;


public class Client {
    public static void main(String[] args) {
        Courses course1=new Courses(new Categories(1,"Programlama"),"JAVA REACT","Yetiştirme Kampı",new Instructor("Engin"),CourseType.FREE);
        CourseService courseService=new CourseService();
        Courses[] courses={course1};
        for (Courses course:courses) {
            System.out.println(course.getCourseName());
        }
        courseService.enrollButton(course1);
        courseService.filterByInstructor("Engin");

    }
}
