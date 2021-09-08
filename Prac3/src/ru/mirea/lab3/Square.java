package ru.mirea.lab3;

public class Square extends Rectangle
{
    protected double side;

    public Square()
    {
        side = 10;
    }

    public Square(String color, boolean filled, double side)
    {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    @Override
    public void setWidth(double side)
    {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side)
    {
        super.setLength(side);
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
