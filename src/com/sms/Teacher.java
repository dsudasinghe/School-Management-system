package com.sms;

/**
 * this class is responsible for keeping the track of teachers name, id  and salary.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    //-------------------------------------------------
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    //--------------------------------------------------


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
