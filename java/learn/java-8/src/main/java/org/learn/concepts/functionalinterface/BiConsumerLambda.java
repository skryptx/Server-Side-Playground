package org.learn.concepts.functionalinterface;

import org.learn.shared.data.StudentDatabase;
import org.learn.shared.models.Student;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerLambda {
    static BiConsumer<Student, String> printThisStudent = (student, name) -> {
        if(student.getName().equals(name)) {
            System.out.println(student.getActivities());
        }
    };

    public static void simpleExample() {
        BiConsumer<String, Integer> isCountMatching = (name, len) -> {
            if(name.length() == len) {
                System.out.println("Name's Length is matching");
                return;
            }
            System.out.println("Name's Length is not matching");

        };

        BiConsumer<String, Integer> doesStringContainChar = (name, ch) -> {
            if(name.indexOf(ch) > -1) {
                System.out.printf("%s contains %c", name, ch);
                System.out.println(ch);
                return;
            }
            System.out.printf("%s does not contain %c", name, ch.toString().charAt(0));

        };

        isCountMatching.andThen(doesStringContainChar).accept("Jagga", 83);
    }

    public static void realLifeExample(List<Student> students, String studentToFind) {
        students.forEach((student ->
            printThisStudent.accept(student, studentToFind)
        ));
    }
    public static void main(String[] args) {
        simpleExample();
        realLifeExample(new StudentDatabase().getStudents(), "Jagga");
    }
}
