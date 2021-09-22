package Practic.src.ru.mirea.task4;
import java.lang.*;
public class Main
{
    public static void main(String[] args)
    {
        Author a = new Author("Denis", "email@mail.ru", 'M');
        System.out.println(a.getName()+" "+a.getGender()+" "+a.getEmail());
        System.out.println(a);

        Ball b =new Ball(100, 100);
        System.out.println(b);
        b.move(30,15);
        System.out.println(b);
    }
}
