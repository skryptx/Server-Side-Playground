package org.learn.functionalinterface;

import org.learn.model.funtionalinterfaces.Student;

import java.util.List;
import java.util.function.BiConsumer;

public class BiComparatorLambda {
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

        isCountMatching.andThen(doesStringContainChar).accept("Sinni", 83);
    }

    public static void realLifeExample(List<Student> students, String studentToFind) {
        students.forEach((student ->
            printThisStudent.accept(student, studentToFind)
        ));
    }
    public static void main(String[] args) {
        simpleExample();
        realLifeExample(List.of(new Student(1,"Present/Future Sinni", List.of("Coding", "Exercise", "Listening Songs")), new Student(1,"Past Sinni", List.of("Eating", "Sleeping", "Gaming"))), "Present/Future Sinni");
    }
}
