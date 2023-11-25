package JavaBasics.Student;

public class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student that) {
        return String.CASE_INSENSITIVE_ORDER.compare(this.name, that.name);
    }

    public String toString() {
        return String.format("Name: %s, RollNo. %d", this.name, this.id);
    }
}
