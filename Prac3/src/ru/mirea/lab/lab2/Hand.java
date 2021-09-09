package ru.mirea.lab.lab2;

public class Hand
{
    private int numOfFingers;

    public Hand(int numOfFingers)
    {
        this.numOfFingers = numOfFingers;
    }

    public Hand()
    {
        this.numOfFingers = 5;
    }

    public void Clap()
    {
        System.out.println("Вы чувствуете, как чья-то рука хлопает вас по плечу");
    }
}
