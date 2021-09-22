package Practic.src.ru.mirea.task5.task2;

public class Akita extends Dog
{
    public Akita(String color, String size)
    {
        super(color, size);
    }

    @Override
    public String toString()
    {
        return ("It's a " +size+" size " +color+ " akita.");
    }
}
