package ThirdWeekHwKodlamaIo.Business.Abstracts;

import ThirdWeekHwKodlamaIo.Entities.Category;
import ThirdWeekHwKodlamaIo.Entities.Instructor;

public interface ICourse {
    boolean checkCourseName(String courseName) throws Exception;
    boolean checkCoursePrice(double price);

    void addCourse(String name, double price, Instructor instructor,
                   Category category) throws Exception;
}
