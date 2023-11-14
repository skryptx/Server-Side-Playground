package JavaBasics.BasicPrograms;

import java.util.Objects;

public class ObjectComparison {
    int age;

    public ObjectComparison(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        var person1 = new ObjectComparison(1);
        var person2 = new ObjectComparison(1);
        System.out.println(Objects.equals(person1, person2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectComparison temp = (ObjectComparison) o;
        return age == temp.age;
    }

}
