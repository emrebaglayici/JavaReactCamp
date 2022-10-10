package ThirdWeekHwKodlamaIo.Entities;

import java.util.List;

public class Course {
    private String name;
    private double price;
    private Instructor instructor;
    private Category category;
    private List<Student> studentList;

    public Course(String name, double price, Instructor instructor, Category category) {
        this.name = name;
        this.price = price;
        this.instructor = instructor;
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", instructor=" + instructor +
                ", category=" + category +
                ", studentList=" + studentList +
                '}';
    }
}
