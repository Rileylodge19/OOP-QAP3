package com.keyin.problemOne;

public class CollegeStudent extends Student{
    protected String myMajor;
    protected int year;


    public CollegeStudent(String myName, int myAge, String myGender, String idNum, double gpa, int year, String major) {
        super(myName, myAge, myGender, idNum, gpa);
        this.myMajor = major;
        this.year = year;
    }

    public String getMajor() {
        return myMajor;
    }

    public void setMajor(String myMajor) {
        this.myMajor = myMajor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return (super.toString() + ", major: "+ this.myMajor+", year: "+ this.year);
    }
}
