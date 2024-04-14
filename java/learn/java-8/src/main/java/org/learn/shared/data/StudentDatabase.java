package org.learn.shared.data;

import org.learn.shared.models.Student;

import java.util.List;

public class StudentDatabase {

    private List<Student> students;

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public StudentDatabase() {
        setStudents(
                List.of(
                    new Student(1,"Jagga", List.of("Coding", "Exercise", "Listening Songs")),
                    new Student(1,"Jatt", List.of("Eating", "Sleeping", "Gaming"))
                )
        );
    }
}
