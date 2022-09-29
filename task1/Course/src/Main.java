public class Main {
    public static void main(String[] args){
        // Create a student as a object

        Student student = new Student("Danyal");

        //Add courses to the student

        Student.addCourse(new Course("Computer Science"));
        Student.addCourse(new Course("Game development"));
        Student.addCourse(new Course("CyperSecurity"));
        System.out.println(student);


    }

}