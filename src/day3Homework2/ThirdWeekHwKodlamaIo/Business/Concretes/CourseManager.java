package day3Homework2.ThirdWeekHwKodlamaIo.Business.Concretes;

import day3Homework2.ThirdWeekHwKodlamaIo.Business.Abstracts.ICourse;
import day3Homework2.ThirdWeekHwKodlamaIo.Entities.Category;
import day3Homework2.ThirdWeekHwKodlamaIo.Entities.Course;
import day3Homework2.ThirdWeekHwKodlamaIo.Entities.Instructor;
import day3Homework2.ThirdWeekHwKodlamaIo.Logger.LoggerManager;

import java.util.ArrayList;
import java.util.List;

public class CourseManager implements ICourse {
    private LoggerManager loggerManager=new LoggerManager();
    List<Course> courses = new ArrayList<>();

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public boolean checkCourseName(String courseName){
        for (Course data : getCourses()) {
            if (data.getName().equals(courseName)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkCoursePrice(double price) {
        return price>=0;
    }

    @Override
    public void addCourse(String name,
                          double price,
                          Instructor instructor,
                          Category category) throws Exception {
        if (!checkCoursePrice(price)){
            throw new Exception("Course price cannot be lower than 0");
        }
        if (getCourses().isEmpty()) {
            Course course = new Course(name, price, instructor, category);
            courses.add(course);
            loggerManager.printLog("Course added");
        }else{
            if (!checkCourseName(name)){
                throw new Exception("Course name cannot repeat");
            }else{
                Course course = new Course(name, price, instructor, category);
                courses.add(course);
                loggerManager.printLog("Course added");
            }
        }
    }
}