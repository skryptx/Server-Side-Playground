package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Sinni");
        System.out.println(students);
        System.out.println(students.size());

        String[] arrayNames = {"sinni", "singla", "shanky"};
        List<String> listNames = new ArrayList<>();
        listNames.addAll(Arrays.stream(arrayNames).toList());
        System.out.println(listNames);
        System.out.println(listNames.get(1));
        listNames.set(2, "singla-s");
        System.out.println(listNames);
    }
}
