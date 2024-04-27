package org.learn.concepts.streams;

import org.learn.shared.data.StudentDatabase;
import org.learn.shared.models.Student;

import java.util.List;
import java.util.Optional;

public class ReduceExample {

    public static Optional<Student> getHighestGpaStudent(List<Student> originalStudents) {
        return originalStudents.stream().reduce((student1, student2) -> {
            if(student1.getGpa() > student2.getGpa()) {
                return student1;
            }
            return student2;
        });
    }

    public static void main(String[] args) {
        var highestGpaStudent = getHighestGpaStudent(new StudentDatabase().getStudents());
        highestGpaStudent.ifPresent(System.out::println);
    }
}
