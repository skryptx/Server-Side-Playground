package JavaBasics.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(List.of(new Student(100, "Sinni"),
                new Student(88, "Harsh"), new Student(189, "Priyanka")));
        Collections.sort(studentList);
        System.out.println(studentList);
    }

}
