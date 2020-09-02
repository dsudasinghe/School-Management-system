package com.sms;

//this class is responsible for keeping the track of students fees, name, grade and fees paid.

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * to create a new student by initializing.
     * @param id for the student : unique
     * @param name of the student.
     * @param grade of the student.
     */
    public Student(int id, String name, int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        
    }
}
