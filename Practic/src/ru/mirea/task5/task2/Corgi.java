package Practic.src.ru.mirea.task5.task2;

public class Corgi extends Dog
{
    private String burnt;

    public Corgi(String color, String size, String burnt)
    {
        super(color, size);
        this.burnt = burnt;
    }

    public Corgi(String color, String size)
    {
        super(color, size);
    }

    @Override
    public String toString()
    {
        return ("It's a " +size+" size " +color+ " " +burnt+ " corgi.");
    }
}