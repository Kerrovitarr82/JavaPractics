package Practic.src.ru.mirea.task5.task3;

public class Chair extends Furniture
{
    public Chair(String color, String size)
    {
        super(color, size);
        cost = 1000;
    }

    @Override
    public String toString()
    {
        return ("It's a " +size+" size " +color+ " chair.");
    }
}