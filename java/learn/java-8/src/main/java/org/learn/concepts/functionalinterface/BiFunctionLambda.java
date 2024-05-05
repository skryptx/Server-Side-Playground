package org.learn.concepts.functionalinterface;

import org.learn.shared.data.StudentDatabase;
import org.learn.shared.models.Student;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionLambda {
    private static final List<Student> students = StudentDatabase.studentsSupplier.get();

    protected static Function<String, List<Student>> nameStartWith =
            (predecessor) -> students.stream().filter((student) -> student.getName().startsWith(predecessor)).toList();

    protected static BiFunction<String, Function<String, List<Student>>, Student> firstStudentNameStartWith =
            (startWith, before) -> before.apply(startWith).getFirst();

    public static void main(String[] args) {
        System.out.println(firstStudentNameStartWith.apply("Jag", nameStartWith));
    }
}
