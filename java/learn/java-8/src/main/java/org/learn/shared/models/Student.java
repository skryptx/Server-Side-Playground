package org.learn.shared.models;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private List<String> activities;

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

    public Student(int id, String name,double gpa, List<String> activities) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.activities = activities;
    }

    @Override()
    public String toString() {
        return "Id: " + getId() + "\nName: " + getName()+ "\nGPA: " + getGpa()  + "\nActivities: " + getActivities();
    }

}
