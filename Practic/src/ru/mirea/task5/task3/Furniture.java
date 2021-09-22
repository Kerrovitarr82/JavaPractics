package Practic.src.ru.mirea.task5.task3;

public abstract class Furniture
{
    protected String color;
    protected String size;
    protected int cost;
    public Furniture()
    {
        color = "White";
        size = "small";
    }
    public Furniture(String color, String size)
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

    public int getCost()
    {
        return cost;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public abstract String toString();
}
