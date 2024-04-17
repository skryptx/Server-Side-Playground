package org.learn.concepts.streams;

import org.learn.shared.data.StudentDatabase;
import org.learn.shared.models.Student;

import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> activities = new StudentDatabase().getStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .toList();
        System.out.println(activities);
    }
}
