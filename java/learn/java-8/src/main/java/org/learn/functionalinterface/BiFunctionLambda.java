package org.learn.functionalinterface;

import org.learn.shared.data.StudentDatabase;
import org.learn.shared.models.Student;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionLambda {
    static List<Student> students = new StudentDatabase().getStudents();

    protected static Function<String, List<Student>> nameStartWith =
            (predecessor) -> students.stream().filter((student) -> student.getName().startsWith(predecessor)).toList();

    protected static BiFunction<String, Function<String, List<Student>>, Student> firstStudentNameStartWith =
            (startWith, before) -> before.apply(startWith).getFirst();

    public static void main(String[] args) {
        System.out.println(firstStudentNameStartWith.apply("Jat", nameStartWith));
    }
}
