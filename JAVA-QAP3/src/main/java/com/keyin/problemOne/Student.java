package com.keyin.problemOne;

public class Student extends Person{
    protected String myIdNum;
    protected double myGPA;

    public Student(String myName, int myAge, String myGender, String idNum, double gpa) {
        super(myName, myAge, myGender);
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    public String getIdNum() {
        return myIdNum;
    }

    public void setIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setGPA(double myGPA) {
        this.myGPA = myGPA;
    }
}
