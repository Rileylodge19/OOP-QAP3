package com.keyin.problemTwo;

public class Circle extends Shape{
    protected double radius = 1.0;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }
    public double getPerimeter() {return (2 * 3.14 * this.radius);}

    @Override
    public String toString() {
        return ("A Circle with radius = "+this.radius+", which is a subclass of " + super.toString());
    }

}
