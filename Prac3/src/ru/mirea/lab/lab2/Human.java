package ru.mirea.lab.lab2;

public class Human
{
    private Head head;
    private Hand hand;
    private Leg leg;

    public Human(int eyes, int fingers, int legs)
    {
        this.head = new Head(eyes);
        this.hand = new Hand(fingers);
        this.leg = new Leg(legs);
    }

    public void HumanWink()
    {
        head.Wink();
    }

    public void HumanCrisp()
    {
        leg.Crisp();
    }

    public void HumanClap()
    {
        hand.Clap();
    }
}
