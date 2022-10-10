package day3Homework2.ThirdWeekHwKodlamaIo.Business.Abstracts;

import day3Homework2.ThirdWeekHwKodlamaIo.Entities.Category;
import day3Homework2.ThirdWeekHwKodlamaIo.Entities.Instructor;

public interface ICourse {
    boolean checkCourseName(String courseName) throws Exception;
    boolean checkCoursePrice(double price);

    void addCourse(String name, double price, Instructor instructor,
                   Category category) throws Exception;
}
