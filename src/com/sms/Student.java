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
        feesPaid=0;
        feesTotal=30000;
    }

    //------------------------------------------------

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    //-------------------------------------------------



    /**
     * use to update student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     *keep adding the fees to feesPaid field.
     * @param fees the fees that the student pays.
     */
    public void updateFeesPaid(int fees){
        feesPaid+=fees;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }
}



