package Polymorphism;


import java.awt.*;

public class Main {
    public static void main(String[] args) {

//        Calculator c = new Calculator();
//        System.out.println(c.add(4,3));
//        System.out.println(c.add(4,3,2));
//        System.out.println(c.add(3,4,2,4.4));

//        runtime polymorphism


        Circle c = new Circle();
//        c.draw();
        doDrawing(c);
//        c.personal();
//
//        Rectangle r = new Rectangle();
//        r.draw();

        shape s = new shape();
        doDrawing(s);

//dowincasting
        Circle cir = new Circle();f
        doDrawing(c);

    }
    public static void doDrawing(shape s){
        s.draw();
//        Circle c = (Circle)s; // downcasiting
//        c.draw();
    }
}

