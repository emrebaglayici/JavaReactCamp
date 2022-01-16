package day3Homework2;

public class Client {
    public static void main(String[] args) {
        User user=new Student(1,"Emre","Bağlayici","emrebaglayici1@gmail.com","123456");
        UserManager userManager=new UserManager(user);
        System.out.println(userManager.showInformation(user));
        userManager.editProfile("Ahmet","Mehmet","ahmet@gmail.com","789456");
        System.out.println(userManager.showInformation(user));

        User user1=new Instructor(1,"Engin","Demiroğ","engin@engin.com","123",new Student(
                2,"Şenol","İnan","senol@gmail.com","sen"
        ));


        InstructorManager instructorManager=new InstructorManager(new Instructor(1,"Engin","Demiroğ","engin@engin.com","123",new Student(
                2,"Mehmet","İnan","mehmet@gmail.com","mehmo"
        )));
        System.out.println(user1.getFirstName());
        System.out.println(instructorManager.getStudents().getFirstName());
        instructorManager.giveHomework("Çalışmak");
        System.out.println(instructorManager.getStudents().getMyHomeworks());


        Student student=new Student(3,"Yasemin","Karası","yasmin@gmail.com","789456");
        StudentManager studentManager=new StudentManager(student);
        Instructor instructor=new Instructor(1,"Engin","Demiroğ","enginengin@e.com","123213",student);
        studentManager.student.setInstructor(instructor);
        studentManager.student.setMyHomeworks("Yat bugün");

        Instructor[] instructors=new Instructor[]{instructor};

        System.out.println(studentManager.listHomework());
        System.out.println(studentManager.student.getInstructor().getFirstName());
        System.out.println(studentManager.showInstructorName(instructor));


    }
}
