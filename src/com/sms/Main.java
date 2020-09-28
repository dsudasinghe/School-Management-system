package com.sms;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Teacher rasika = new Teacher(1, "Rasika",500);
        Teacher sulari = new Teacher(2, "Sulari",700);
        Teacher naji = new Teacher(3, "Naji",600);

        List<Teacher> listTeacher = new ArrayList<>();
        listTeacher.add(rasika);
        listTeacher.add(sulari);
        listTeacher.add(naji);

        //------------------------------------------------------------

        Student hiranya = new Student(1, "Hiranya", 10);
        Student lalindu = new Student(2, "Lalindu", 10);
        Student maleesh = new Student(3, "Maleesh", 10);

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(hiranya);
        listStudent.add(lalindu);
        listStudent.add(maleesh);

        //------------------------------------------------------------

        School bc = new School(listTeacher, listStudent);


        hiranya.payFees(5000);
        lalindu.payFees(6000);
        System.out.println("BC has earned $"+ bc.getTotalMoneyEarned());

        System.out.println("----MAKING BC PAY SALARY----");
        rasika.receiveSalary(rasika.getSalary());
        System.out.println("BC has spent for salary for " +rasika.getName() + " and now has $" +bc.getTotalMoneyEarned());

        System.out.println(hiranya.toString());
        System.out.println(rasika.toString());
        System.out.println(bc.toString());
    }
}
