package ThirdWeekHwKodlamaIo;

import ThirdWeekHwKodlamaIo.Business.Concretes.CategoryManager;
import ThirdWeekHwKodlamaIo.Business.Concretes.CourseManager;
import ThirdWeekHwKodlamaIo.Entities.Category;
import ThirdWeekHwKodlamaIo.Entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        CourseManager courseManager=new CourseManager();
        CategoryManager categoryManager=new CategoryManager();

        categoryManager.addCategory("Frontend");
        System.out.println(categoryManager.getCategories().toString());

        courseManager.addCourse("java102",1500.0
                ,new Instructor("Emre Bağlayici")
                ,new Category("Frontend"));

        courseManager.addCourse("java103",1510.0
                ,new Instructor("Emre Bağlayici")
                ,new Category("Backend"));
        System.out.println(courseManager.getCourses().toString());



    }
}
