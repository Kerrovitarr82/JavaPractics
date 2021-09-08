package ru.mirea.lab3;
import java.lang.*;
public class Main
{
    public static void main(String[] args)
    {
        Shape s1 = new Circle(10, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.getFilled());
        //System.out.println(s1.getRadius());

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.getFilled());
        System.out.println(c1.getRadius());
    }
}
