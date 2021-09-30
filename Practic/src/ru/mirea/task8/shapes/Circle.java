package Practic.src.ru.mirea.task8.shapes;

public class Circle extends Shape{
    private double radius = 1.0f;
    private String name = "Circle";
    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }
}
