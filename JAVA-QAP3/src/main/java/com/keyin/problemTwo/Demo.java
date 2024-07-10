package com.keyin.problemTwo;

public class Demo {
    public static void main(String[] args) {
        Shape S = new Shape("Red", true);

        Circle C = new Circle(5.0);

        Circle C1 = new Circle(5.0,"blue",true);

        Rectangle R = new Rectangle(2.0,3.0);

        Rectangle R1 = new Rectangle("green",false,2.0,3.0);

        Square Sq = new Square(4.0);

        Square Sq1 = new Square(4.0,"yellow",true);

        System.out.println(S);

        System.out.println(C);

//Print here (C.getArea() and C.getPerimeter())
        System.out.println("Area of C = "+C.getArea()+", perimeter = "+C.getPerimeter());

        System.out.println(C1);

//Print here(C1.getArea() and C1.getPerimeter())
        System.out.println("Area of C1 = "+C1.getArea()+", perimeter = "+C1.getPerimeter());

        System.out.println(R);

//Print(R.getArea() and R.getPerimeter())
        System.out.println("Area of R = "+R.getArea()+", perimeter = "+R.getPerimeter());

        System.out.println(R1);

//Print(R1.getArea() and R1.getPerimeter())
        System.out.println("Area of R1 = "+R1.getArea()+", perimeter = "+R1.getPerimeter());

        System.out.println(Sq);

        //Print(sq.getArea() and sq.getPerimeter())
        System.out.println("Area of Sq = "+Sq.getArea()+", perimeter = "+Sq.getPerimeter());

        System.out.println(Sq1);

        //Print(sq1.getArea() and sq1.getPerimeter())
        System.out.println("Area of Sq1 = "+Sq1.getArea()+", perimeter = "+Sq1.getPerimeter());

    }
}
