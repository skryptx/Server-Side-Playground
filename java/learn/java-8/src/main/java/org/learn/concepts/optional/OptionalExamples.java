package org.learn.concepts.optional;

import org.learn.shared.data.StudentDatabase;
import org.learn.shared.models.Student;
import java.util.List;
import java.util.Optional;

public class OptionalExamples {
    public static Optional<List<String>> getActivitiesByStudentName(String name) {
        return StudentDatabase.studentsSupplier.get().stream()
                .filter(student -> student.getName().equals(name))
                .map(Student::getActivities).findFirst();
    }

    public static void main(String[] args) {
        Optional<List<String>> studentActivitiesByName = getActivitiesByStudentName("Mannu");
        studentActivitiesByName.ifPresent(System.out::println);

        Optional<List<Student>> data = Optional.ofNullable(StudentDatabase.studentsSupplier.get());
        data.map(List::getFirst).map(Student::getDogName)
                .flatMap(val -> val).ifPresent(System.out::println);
    }
}
