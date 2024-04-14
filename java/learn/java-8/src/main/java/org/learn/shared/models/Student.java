package org.learn.shared.models;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<String> activities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public Student(int id, String name, List<String> activities) {
        this.id = id;
        this.name = name;
        this.activities = activities;
    }

    @Override()
    public String toString() {
        return "Id: " + getId() + "\nName: " + getName() + "\nActivities: " + getActivities();
    }

}
