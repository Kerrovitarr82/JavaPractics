package Practic.src.ru.mirea.task2;

import java.util.ArrayList;

public class TestDog
{
    ArrayList<Dog> dogs = new ArrayList<Dog>();

    public void dogAdd(String name, int age)
    {
        dogs.add(new Dog(age, name));
    }

    public void dogsShow()
    {
        System.out.println(dogs);
    }
}