import java.util.ArrayList;

public class Student {
private static String name;
private static ArrayList<Course> courses = new ArrayList<>();

public Student(String name)
{
    this.name = name;
}
public static void addCourse(Course course){
    courses.add(course);
}
@Override
    public String toString(){
    return ("the student " +name+ " takes these courses" +courses);
}
}