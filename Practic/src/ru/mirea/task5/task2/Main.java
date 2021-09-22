package Practic.src.ru.mirea.task5.task2;

public class Main
{
    public static void main(String[] args)
    {
        Dog akita = new Akita("white", "medium");
        System.out.println(akita);
        akita.Voice();
        Dog corgi = new Corgi("orange", "medium","a little burnt)");
        System.out.println(corgi);
        corgi.Voice();
    }

}
