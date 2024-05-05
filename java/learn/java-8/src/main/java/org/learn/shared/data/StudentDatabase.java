package org.learn.shared.data;

import org.learn.shared.models.Student;

import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {
    public static Supplier<List<Student>> studentsSupplier =  () ->
        (
                List.of(
                        new Student(1,"Jagga",4.0, List.of("Coding", "Exercise", "Listening Songs")),
                        new Student(1,"Jatt", 3.5, List.of("Eating", "Sleeping", "Gaming")),
                        new Student(1,"Mannu", 2.5, List.of("Eating", "Sleeping", "Gaming")),
                        new Student(1,"Gudiya", 1.5, List.of("Eating", "Sleeping", "Gaming"))
                )
        );
}
