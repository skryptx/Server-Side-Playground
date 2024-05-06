package org.learn.shared.models;

import java.util.List;
import java.util.Optional;

public class Student {
    private final int id;
    private final String name;
    private final double gpa;
    private final List<String> activities;
    private Optional<String> dogName;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
    public List<String> getActivities() {
        return activities;
    }
    public Optional<String> getDogName() { return dogName; }

    public Student(int id, String name,double gpa, List<String> activities) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.activities = activities;
    }

    public Student(int id, String name,double gpa, List<String> activities, String dogName) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.activities = activities;
        this.dogName = dogName.describeConstable();
    }

    @Override()
    public String toString() {
        return "Id: " + getId() + "\nName: " + getName()+ "\nGPA: " + getGpa()  + "\nActivities: " + getActivities();
    }

}
