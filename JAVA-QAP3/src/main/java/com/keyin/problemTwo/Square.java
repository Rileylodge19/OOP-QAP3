package com.keyin.problemTwo;

public class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(color,filled,side,side);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    @Override
    public String toString() {
        return ("A Square with side = "+this.getSide()+", which is a subclass of "+super.toString());
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }


}
