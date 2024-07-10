package com.keyin.problemOne;

public class Teacher extends Person{
    protected String mySubject;
    protected Double annualSalary;

    public Teacher(String myName, int myAge, String myGender, String subject, double salary) {
        super(myName, myAge, myGender);
        this.mySubject = subject;
        this.annualSalary = salary;
    }

    public String getSubject() {
        return mySubject;
    }

    public void setSubject(String mySubject) {
        this.mySubject = mySubject;
    }

    public Double getSalary() {
        return annualSalary;
    }

    public void setSalary(Double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return (super.toString() + ", Subject: "+ this.mySubject + ", Salary: $"+ this.annualSalary);
    }
}
