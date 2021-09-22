package Practic.src.ru.mirea.task5.task2;

public abstract class Dog
{
    protected String color;
    protected String size;
    public Dog()
    {
        color = "White";
        size = "small";
    }
    public Dog(String color, String size)
    {
        this.color = color;
        this.size = size;
    }
    public String getColor()
    {
        return color;
    }

    public String getSize()
    {
        return size;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public void Voice()
    {
        System.out.println("Woof! Woof!");
    }

    public abstract String toString();
}
