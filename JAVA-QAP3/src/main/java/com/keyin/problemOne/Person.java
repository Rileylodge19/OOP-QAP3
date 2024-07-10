package com.keyin.problemOne;

public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String myName, int myAge, String myGender) {
        this.myName = myName;
        this.myAge = myAge;
        this.myGender = myGender;
    }

    public String getName() {
        return this.myName;
    }

    public void setName(String myName) {
        this.myName = myName;
    }

    public int getAge() {
        return this.myAge;
    }

    public void setAge(int myAge) {
        this.myAge = myAge;
    }

    public String getGender() {
        return this.myGender;
    }

    public void setGender(String myGender) {
        this.myGender = myGender;
    }

    @Override
    public String toString() {
        return (this.myName + ", age: " + this.myAge + ", gender: " + this.myGender);
    }
}
