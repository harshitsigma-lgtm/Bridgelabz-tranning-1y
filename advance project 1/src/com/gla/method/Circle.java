package com.gla.method;

public class Circle {
    public void areaofcircle(int radius){
        double area = Math.PI*radius*radius;
        System.out.println(area);

    }
    public void circumofcircle(int radius){
        System.out.println("circum of circle :-");
        double circle = Math.PI*radius;
        System.out.println(circle);
    }

    public static void main(String[] args) {
        Circle cl = new Circle();
        cl.circumofcircle(10);
        cl.areaofcircle( 20);
    }
}
