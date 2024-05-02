package org.learn.concepts.streams;

import org.learn.shared.data.StudentDatabase;
import org.learn.shared.models.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        Map<String, List<String>> nameToStudentMap= new StudentDatabase().getStudents().stream()
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        var count = (int) new StudentDatabase().getStudents().stream().map(Student::getName).count();

        System.out.println("Hash: " + nameToStudentMap);
        System.out.println("All Names: " + count);
    }
}
