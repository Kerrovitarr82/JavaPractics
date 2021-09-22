package Practic.src.ru.mirea.task5.task3;

public class Table extends Furniture
{
    public Table(String color, String size)
    {
        super(color, size);
        cost = 2000;
    }

    @Override
    public String toString()
    {
        return ("It's a " +size+" size " +color+ " table.");
    }
}
