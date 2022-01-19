package day2HomeWork1;

public class Courses {
    private int courseId;
    private Categories categories;
    private String courseName;
    private String description;
    private Instructor instructor;
    private CourseType courseType;

    public Courses(Categories categories, String courseName, String description, Instructor instructor, CourseType courseType) {
        this.categories = categories;
        this.courseName = courseName;
        this.description = description;
        this.instructor = instructor;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseId() {
        return courseId;
    }
}
