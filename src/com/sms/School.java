package com.sms;


import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;



    public School(List<Teacher> teacher, List<Student> students) {
        this.teachers = teacher;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }


    public List<Teacher> getTeacher() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void updateMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateMoneySpent(int moneySpent) {
        totalMoneyEarned-= moneySpent;
    }


    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void addStudents(Student student) {
        students.add(student);
    }
}
