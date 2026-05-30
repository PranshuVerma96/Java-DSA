package Polymorphism;

public class Circle extends shape{
    @Override
    public void draw(){
        System.out.println("circule draw");
    }
    public void personal(){
        System.out.println("Personal method of Circle");
    }
}
